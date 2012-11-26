package basicmessaging.main.test;

import basicmessaging.MessageSender;
import basicmessaging.message.MessageType;
import basicmessaging.message.TestMessage;


public class TestMainSender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestMessage tMesg = new TestMessage();
		tMesg.setMesgType(MessageType.TEST_PING);
		tMesg.setVal("ok");
		MessageSender.getInstance().sendMessage(tMesg, "localhost", 5000);
	}

}