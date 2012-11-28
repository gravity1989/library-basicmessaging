package basicmessaging.peer;

import java.io.Serializable;

public class PeerHandle implements Serializable{

	String IP;
	int port;

	public PeerHandle(String ip) {
		this.IP = ip;
	}
	public PeerHandle(String ip, int port) {
		this.IP = ip;
		this.port = port;

	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}

	public boolean sameAs(PeerHandle peer2)
	{
		if((this.getIP().equals(peer2.getIP()))&&( this.getPort() == (peer2.getPort() )))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
