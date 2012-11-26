package basicmessaging.message;

import java.io.Serializable;

public class BaseMessage implements Serializable{
	MessageType mesgType;

	BaseMessage()
	{

	}
	public BaseMessage(MessageType mType)
	{
		this.mesgType = mType; 
	}

	public MessageType getMesgType() {
		return mesgType;
	}

	public void setMesgType(MessageType mesgType) {
		this.mesgType = mesgType;
	}
}
