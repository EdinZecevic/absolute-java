package calculateage;
public class Test {
	public static void main(String[] args) {
		
		CalAge input= new CalAge();
		System.out.println("Enter day, month and year: ");
		input.setDate();
		input.checkDate();
		input.returnAge();
		double getkDay=input.getDay();
		System.out.println("Your day: "+getkDay);
		double getkMonth=input.getMonth();
		System.out.println("Your month: "+getkMonth);
		double getkYear=input.getYear();
		System.out.println("Your year: "+getkYear);
		}
	}