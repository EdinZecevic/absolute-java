package message;

public class Test {
	public static void main(String[] args) {
		Message message=new Message("Sunce moje koga sada grejes");
		SMS sms=new SMS("Himzo Polovina", 21458);
		Email email=new Email("Hamdo","Sinan","Muzika");
		
		System.out.println(message);
		System.out.println(sms);
		System.out.println(email);
		boolean mesage1 = message.ContainsKeyword(message, "Sunce");
		System.out.println(mesage12);
}
}
