package basicmessaging.main.test;

import basicmessaging.ConnectionListener;
import basicmessaging.TestMessageHandler;

public class TestMesgReceiver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ConnectionListener cListener = new ConnectionListener(5000, new TestMessageHandler());

	}

}
