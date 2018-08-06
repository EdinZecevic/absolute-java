package call;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int SourcePhoneNumber;
		int DestinationPhoneNumber;
		int DurationInSeconds;
		int DurationTotal;
		double PriceOfCall;
		int PriceOfAllCals;
		
		NationalCall call=new NationalCall();
		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Enter source phone number: ");
		SourcePhoneNumber=keyboard.nextInt();
		System.out.println("Enter destination phone number: ");
		DestinationPhoneNumber=keyboard.nextInt();
		System.out.println("Enter duration in seconds: ");
		DurationInSeconds=keyboard.nextInt();
		double getDurationTotal=call.getDurationTotal(DurationInSeconds);
		System.out.println("Total duration in minutes: "+getDurationTotal);
		double getPrice=call.getPrice(getDurationTotal);
		System.out.println("Total cost: "+getPrice+" $");
		double DiscountCall=call.DiscountCall(getDurationTotal);
		System.out.println("Total discount: "+DiscountCall+" $");
		PriceOfCall=getPrice-DiscountCall;
		System.out.println("Total price with discount: "+PriceOfCall+" $");
	}

}
