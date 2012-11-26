package basicmessaging.test.main;

import basicmessaging.MessageSender;
import basicmessaging.message.MessageType;
import basicmessaging.test.TestMessage;


public class TestMainSender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestMessage tMesg = new TestMessage();
		tMesg.setVal("ok");
		MessageSender.getInstance().sendMessage(tMesg, "localhost", 5000);
	}

}
