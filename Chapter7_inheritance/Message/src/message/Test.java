package message;

public class Test {
	public static void main(String[] args) {
		Message message=new Message("Sunce moje koga sada grejes");
		SMS sms=new SMS("Himzo Polovina", 21458);
		Email email=new Email("Hamdo","Sinan","Muzika");
		
		System.out.println(message);
		System.out.println(sms);
		System.out.println(email.toString());
		boolean mesage1 = Message.ContainsKeyword(message, "Sunce");
		System.out.println(mesage1);
}
}
