package basicmessaging;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.xml.bind.Marshaller.Listener;

import basicmessaging.message.BaseMessage;
import basicmessaging.messagehandler.MessageHandler;



public class ConnectionListener {

	int port;
	ServerSocket lisener;
	Socket server;

	public ConnectionListener(int protport, MessageHandler mesgHandler)
	{
		this.port = protport;
		try {
			lisener = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true)
		{
			try {
				server = lisener.accept();
				MessageRecvHandlerThread newThread = new MessageRecvHandlerThread(mesgHandler, server);
				Thread t = new Thread(newThread);
				t.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}

class MessageRecvHandlerThread implements Runnable
{
	MessageHandler myMesgHandler;
	Socket myServer;
	BaseMessage myMesg;

	public MessageRecvHandlerThread(MessageHandler mesgHandler, Socket server)
	{
		myMesgHandler = mesgHandler;
		myServer = server;
	}
	public void run() {
		InputStream is;
		try {
			is = myServer.getInputStream();
			myMesg = (BaseMessage)(new ObjectInputStream(is)).readObject();
			is.close();
			myServer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myMesgHandler.onReceive(myMesg);
	}

}
