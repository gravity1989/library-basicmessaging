package basicmessaging.messagehandler;

import basicmessaging.message.BaseMessage;
import basicmessaging.message.MessageType;
import basicmessaging.message.TestMessage;

public class TestMessageHandler implements MessageHandler {


	public void onReceive(BaseMessage mesg) {

		MessageType mesgType = mesg.getMesgType();
		switch(mesgType)
		{
		case TEST_PING:
			TestMessage tMesg = (TestMessage)mesg;
			System.out.println("got mesg: " + tMesg.getVal());
			break;
		default:
			System.out.println("Wrong message type");				
		}

	}

}
