package airplaineseats;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String [][] a= new String[100][100];
		@SuppressWarnings("resource")
		Scanner keyboard= new Scanner(System.in);
		int k;
		int b;
		AirplaineSeats.setTableNumbers();
		System.out.println("   ");
		AirplaineSeats.returnTableNumberss(a);
		System.out.println("   ");
		System.out.println("Enter the row: ");
		k=keyboard.nextInt();
		System.out.println("Enter the column: ");
		b=keyboard.nextInt();
		
		AirplaineSeats.returnTableNumbers(k,b);
	}

}
