package MessageUtility;

import java.io.Serializable;

public class Message implements Serializable {
	private String message_content;
	private String origin_user;
	
	public Message(){	
	}
	
	public void setMessage(String message){
		this.message_content = message;
	}
	
	public void setOrigin(String origin_user){
		this.origin_user = origin_user;
	}
	
	public String getMessage(){
		return message_content;
	}
	
	public String getOrigin(){
		return origin_user;
	}
}