package courieragency;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		CourierAgency input=new CourierAgency();
		
		String nameOfPlace;
		System.out.println("Entered the name of place city or country");
		nameOfPlace=keyboard.nextLine();
		
		input.checkCityOrCountry(nameOfPlace);
		input.setWeightOfParcels();
		input.getWeightOfParcels();
		input.setPriceForPlace(nameOfPlace);
	}

}
