package call;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		long  SourcePhoneNumber;
		long DestinationPhoneNumber;
		int DurationInSeconds;
		int DurationTotal;
		double PriceOfCall;
		int PriceOfAllCals;
		long min=38761000000L;
		long max=38767000000L;
		
		NationalCall call=new NationalCall();
		Internationalcall call1= new Internationalcall();
		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Enter source phone number: ");
		SourcePhoneNumber=keyboard.nextLong();
		System.out.println("Enter destination phone number: ");
		DestinationPhoneNumber=keyboard.nextLong();
		System.out.println("Enter duration in seconds: ");
		DurationInSeconds=keyboard.nextInt();
		double getDurationTotal=call.getDurationTotal(DurationInSeconds);
		System.out.println("Total duration in minutes: "+getDurationTotal);
		
		if(SourcePhoneNumber>min && DestinationPhoneNumber>min && SourcePhoneNumber<max && DestinationPhoneNumber<max) {
			double getPrice=call.getPrice(getDurationTotal);
			System.out.println("Total cost of national call: "+getPrice+" $");
			double DiscountCall=call.DiscountCall(getDurationTotal);
			System.out.println("Total discount of national call: "+DiscountCall+" $");
			PriceOfCall=getPrice-DiscountCall;
			System.out.println("Total price with discount of national call: "+PriceOfCall+" $");
		}
		else {
			double getPrice=call1.getPrice(getDurationTotal);
			System.out.println("Total cost of international call: "+getPrice+" $");
			double DiscountCall=call1.DiscountCall(getDurationTotal);
			System.out.println("Total discount of international call: "+DiscountCall+" $");
			PriceOfCall=getPrice-DiscountCall;
			System.out.println("Total price with discount of international call: "+PriceOfCall+" $");
			
		}
	}

}
