package airplaineseats;

import java.util.Scanner;

public class AirplaineSeats {
	static Scanner keyboard= new Scanner(System.in);
	static String [][] a= new String[100][100];
	
	public static void setTableNumbers() {
		int i,j,s=0;
		for(i=1; i<2;i++) {
			for(j=1; j<=7;j++) {

				System.out.println("   ");
				System.out.print(j);

				a[i][j]= "    A";
				System.out.print(a[i][j]);
				System.out.print(" "+(i-s)+"  "+j);	
				i++;
				a[i][j]= "     B";
				System.out.print(a[i][j]);
				System.out.print(" "+(i-s)+"  "+j);	
				i++;
				a[i][j]= "     C";
				System.out.print(a[i][j]);
				System.out.print(" "+(i-s)+"  "+j);	
				i++;
				a[i][j]= "     D";
				System.out.print(a[i][j]);
				System.out.print(" "+(i-s)+"  "+j);

				
			}
			//This is the table with printed adress for ex. 1c have adress 3-1(a[3][1])
	}
		}
			
	
	public static String returnTableNumberss(String [][] a) {
		int i,j = 0;
		for(i=1; i<2;i++) {
			for(j=1; j<=7;j++) {
				System.out.println("   ");
				System.out.print(j);
				a[i][j]= "    A";
				System.out.print(a[i][j]);
				
				i++;
				a[i][j]= "     B";
				System.out.print(a[i][j]);
				
				i++;
				a[i][j]= "     C";
				System.out.print(a[i][j]);
				
				i++;
				a[i][j]= "     D";
				System.out.print(a[i][j]);
				
				i++;	
			}
	}
		return a[i][j];	
	}
	
	public static void returnTableNumbers(int k,int b) {
		int i,j;
		for(i=1; i<2;i++) {
			for(j=1; j<=7;j++) {
				System.out.println("   ");
				System.out.print(j);
				
				if(i==k && j==b) {
					System.out.print("    ");
				a[i][j]= "x";
				System.out.print(a[i][j]);
				}
				else {
					System.out.print("    ");
					a[i][j]= "A";
					System.out.print(a[i][j]);
				}
				i++;
				if(i==k && j==b) {
					System.out.print("    ");
					a[i][j]= "x";
					System.out.print(a[i][j]);
					}
					else {
						System.out.print("    ");
						a[i][j]= "B";
						System.out.print(a[i][j]);
					}
				i++;
				if(i==k && j==b) {
					System.out.print("    ");
					a[i][j]= "x";
					System.out.print(a[i][j]);
					}
					else {
						System.out.print("    ");
						a[i][j]= "C";
						System.out.print(a[i][j]);
					}
				i++;
				if(i==k && j==b) {
					System.out.print("    ");
					a[i][j]= "x";
					System.out.print(a[i][j]);
					}
					else {
						System.out.print("    ");
						a[i][j]= "D";
						System.out.print(a[i][j]);
					}
			}
			
		}
	
	}

}
