package basicmessaging;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import basicmessaging.message.BaseMessage;
import basicmessaging.peer.PeerHandle;




public class MessageSender {

	static MessageSender mesgSender;
	MessageSender() { // Singleton pattern
	
	}
	
	public static synchronized MessageSender getInstance()
	{
		if(mesgSender == null)
		{
			mesgSender = new MessageSender();			
		}
		return mesgSender;
	}
	
	public void sendMessage(BaseMessage mesg, String destIp, int destPort)
	{
		try {
			Socket clientSocket = new Socket(destIp,destPort);
			OutputStream os = clientSocket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(mesg);
			oos.close();
			clientSocket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
