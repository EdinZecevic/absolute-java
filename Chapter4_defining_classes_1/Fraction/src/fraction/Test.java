package fraction;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard= new Scanner(System.in);
		Fraction input=new Fraction();
		
		int numerator=1;
		int denominator;
		int numerator1=1;
		int denominator1;
		//System.out.println("Enter numerator: ");
		//numerator=keyboard.nextInt();
		//System.out.println("Enter denominator: ");
		//denominator=keyboard.nextInt();	
		//System.out.println(input.toString(numerator,denominator));
		//System.out.println("Number reduced to Lowest Terms : ");
		//System.out.println(input.reducetToLowestTerms(numerator, denominator));
	
		
		
		while(numerator!=0) {
			
			System.out.println("Enter numerator: ");
			numerator=keyboard.nextInt();
			System.out.println("Enter denominator: ");
			denominator=keyboard.nextInt();	
			
			System.out.println(input.toString(numerator,denominator));
			System.out.println("Number reduced to Lowest Terms : ");
			System.out.println(input.reducetToLowestTerms(numerator, denominator));
			
			System.out.println("Enter numerator: ");
			numerator1=keyboard.nextInt();
			System.out.println("Enter denominator: ");
			denominator1=keyboard.nextInt();	
			
			System.out.println(input.toString(numerator,denominator));
			System.out.println("Number reduced to Lowest Terms : ");
			System.out.println(input.reducetToLowestTerms(numerator, denominator));
			
			System.out.println(input.chechEqualities(numerator, numerator1, denominator, denominator1));
			System.out.println("Next comparation: ");
		}
		
		
	}

}
