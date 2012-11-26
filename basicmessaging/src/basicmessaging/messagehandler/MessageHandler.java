package basicmessaging.messagehandler;

import basicmessaging.message.BaseMessage;

public interface MessageHandler {

	public void onReceive(BaseMessage mesg);
	
}
