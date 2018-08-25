package caltheaverage;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		
		Average Average=new Average();
		
		try {
			int n;
		System.out.println("Enter number of N! ");
		n=keyboard.nextInt();
		if(n<0) 
			throw new Exception();
		
		int [] a= new int [n];
		int sum=0;
		int i;
		for(i=0;i<a.length;i++) {
			System.out.println("Enter number "+(i+1)+" :");
			a[i]=keyboard.nextInt();
			sum=sum+a[i];
			
		}
			Average.setAverage(sum, a.length);
		}
		
		catch (Exception e) {
			System.out.println(CalTheAverage.getMessage());
		}
		
		System.out.println("average is: "+Average.getAverage());
		
		
	}

}
