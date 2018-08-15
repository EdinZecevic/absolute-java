package airplaineseats;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String [][] a= new String[1000][1000];
		@SuppressWarnings("resource")
		Scanner keyboard= new Scanner(System.in);
		int [] k=new int [25];
		int [] b=new int [8];;
		AirplaineSeats.setTableNumbers();
		System.out.println("   ");
		AirplaineSeats.returnTableNumberss(a);
		System.out.println("   ");
		for(int m=0; m<25;m++) {
		System.out.println("Enter the row: ");
		k[m]=keyboard.nextInt();
		System.out.println("Enter the column: ");
		b[m]=keyboard.nextInt();
		
		AirplaineSeats.returnTableNumbers(k,b);
		System.out.println("   ");
		}
	}**

}
