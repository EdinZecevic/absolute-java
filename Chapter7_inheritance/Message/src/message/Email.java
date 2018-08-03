package message;

public class Email {
	public String sender;
	public String reciver;
	public String subject;
	
	public Email() {
		sender="no sender";
		reciver="no reciver";
		subject="no subject";
	}
	
	public Email(String sender) {
		setSender(sender);
		reciver="no reciver";
		subject="no subject";
	}
	public Email(String sender,String reciver) {
		setSender(sender);
		setReciver(reciver);
		subject="no subject";
	}
	public Email(String sender,String reciver,String subject) {
		setSenderReciverSubject( sender, reciver, subject);
	}
	
	public void setSender(String sender) {
		this.sender=sender;
	}
	public void setReciver(String reciver) {
		this.reciver=reciver;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public void setSenderReciverSubject(String sender,String reciver,String subject) {
		this.sender=sender;
		this.reciver=reciver;
		this.subject=subject;
	}
	
	public String getSender() {
		return sender;
	}
	public String getReciver() {
		return reciver;
	}
	public String getSubject() {
		return subject;
	}
	
	public String toString() {
		return (super.toString()+" "+sender+" "+reciver+" "+subject);
	}
	
}
