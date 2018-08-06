package pizza;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		String size;
		int cheese;
		int pepperoni;
		int ham;
		
	Pizza 	pizzaa=new Pizza();
	
	Scanner keyboard= new Scanner(System.in);
	
	System.out.println("Enter size of pizza: ");
	size=keyboard.nextLine();
	System.out.println("Enter amount of cheese: ");
	cheese=keyboard.nextInt();
	System.out.println("Enter amount of pepperoni: ");
	pepperoni=keyboard.nextInt();
	System.out.println("Enter amount of ham: ");
	ham=keyboard.nextInt();
	
	pizzaa.setSize(size);
	pizzaa.setCheese(cheese);
	pizzaa.setPepperoni(pepperoni);
	pizzaa.setHam(ham);
	
	double calcCost = pizzaa.calcCost(size,cheese, pepperoni, ham);
	System.out.println("Cost is: "+calcCost);
	String getDescription=pizzaa.getDescription();
	System.out.println(getDescription);
}
}