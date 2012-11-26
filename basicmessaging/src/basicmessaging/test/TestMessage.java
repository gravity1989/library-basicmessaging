package basicmessaging.test;

import basicmessaging.message.BaseMessage;
import basicmessaging.message.MessageType;

public class TestMessage extends BaseMessage{

	String val;
	
	public TestMessage(MessageType mType)
	{
		super(mType);
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
	
}
