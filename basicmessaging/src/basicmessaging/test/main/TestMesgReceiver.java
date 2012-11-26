package basicmessaging.test.main;

import basicmessaging.ConnectionListener;
import basicmessaging.test.TestMessageHandler;

public class TestMesgReceiver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ConnectionListener cListener = new ConnectionListener(5000, new TestMessageHandler());

	}

}
