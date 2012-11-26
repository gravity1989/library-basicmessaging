package basicmessaging.message;

import java.io.Serializable;

public class BaseMessage implements Serializable{
	MessageType mesgType;

	public MessageType getMesgType() {
		return mesgType;
	}

	public void setMesgType(MessageType mesgType) {
		this.mesgType = mesgType;
	}
}
