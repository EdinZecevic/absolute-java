package message;

public class Message {
	
	public String text;
	
	public Message() {
		text="empty";
	}	
	public Message(String text) {
		setMessage(text);
	}
	public void setMessage(String text) {
		this.text=text;
	}
	public String toString() {
		return text;
	}
	
	public static boolean ContainsKeyword(Message messageObject, String keyword) {
		if(messageObject.toString().indexOf(keyword,0)>=0) 
			return true;
		return false;
		}
}
