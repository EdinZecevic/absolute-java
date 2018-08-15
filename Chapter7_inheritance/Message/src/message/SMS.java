package message;

public class SMS extends Message {
	
	public static String recipientContact;
	public int no;
	
	public SMS() {
		recipientContact="No recipient Contact";
		no=0;
	}
	public SMS(String recipientContact) {
		setRecipientContact(recipientContact);
		no=0;
	}
	public SMS(int no) {
		recipientContact="No recipient Contact";
		setNo(no);
	}
	public SMS(String recipientContact,int no) {
		setRecipientContactAndNo(recipientContact,no);
	}
	
	public void setRecipientContact(String recipientContact) {
		this.recipientContact=recipientContact;
	}
	public void setNo(int no) {
		this.no=no;
	}
	public void setRecipientContactAndNo(String recipientContact,int no) {
		this.recipientContact=recipientContact;
		this.no=no;
	}
	
	public String getRecipientContact() {
		return recipientContact;
	}
	
	public int getNo() {
		return no;
	}
	public  String toString() {
		return(recipientContact+" "+no);
	}
}
