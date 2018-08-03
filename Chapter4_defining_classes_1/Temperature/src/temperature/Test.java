package temperature;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard= new Scanner(System.in);
		float temperature;
		char scale;
		System.out.println("Enter scale C or F: ");
		scale=keyboard.next(".").charAt(0);
		System.out.println("Enter temperature: ");
		temperature=keyboard.nextFloat();
		
		Temperature input = new Temperature();
		
		Temperature temp = new Temperature(scale),
					temp1 = new Temperature(temperature),
					temp2 = new Temperature(scale,temperature),
					temp3 = new Temperature();
		
		System.out.println("Your temperature is :" +temp);
		System.out.println("Your temperature is :" +temp1);
		System.out.println("Your temperature is :" +temp2);
		System.out.println("Your temperature is :" +temp3);
		
		float getTemperatureAll = input.getTemperatureAll(scale,temperature);
		System.out.println("Your temperature is :" +getTemperatureAll);

		
	}
}
