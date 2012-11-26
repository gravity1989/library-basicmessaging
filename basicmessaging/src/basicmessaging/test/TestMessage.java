package basicmessaging.test;

import basicmessaging.message.BaseMessage;
import basicmessaging.message.MessageType;

public class TestMessage extends BaseMessage{

	String val;
	
	public TestMessage()
	{
		super(MessageType.TEST_PING);
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
	
}
