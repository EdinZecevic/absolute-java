package pet;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard= new Scanner(System.in);

		
		double weight;
		String animal;
		System.out.println("Enter animal dog or cat: ");
		animal=keyboard.nextLine();
		System.out.println("Enter weight of animal: ");
		weight=keyboard.nextDouble();
		
		
		Pet pet =new Pet(animal),
			pet1 =new Pet(animal,weight);
			
		System.out.println(pet.toString());
		System.out.println(pet1.toString());
		
	}
}
