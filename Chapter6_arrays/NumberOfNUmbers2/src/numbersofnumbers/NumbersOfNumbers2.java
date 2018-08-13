package numbersofnumbers;

import java.util.Scanner;

public class NumbersOfNumbers2 {
	static Scanner keyboard= new Scanner(System.in);
	
	public  static void setNumbers(int[]array){
		int i;
		for(i=0; i<array.length;i++) {
			System.out.println("Enter the "+(i+1)+" number");
			array[i]=keyboard.nextInt();
		}
		}
	
	public static void countNumbers(int[]array) {
		int counter = 1;
			for(int i=0; i<array.length; i++) {
				counter = 0;
				for(int j=0; j<array.length; j++) {
				if(array[i]==array[j]) {
					counter++;
				}
				}
				System.out.println(array[i]+"  "+counter);
			
			}
	}
	public static int indexOfSmallest(int [] merged, int startIndex, int mergedLength) {
		double min =merged[startIndex];
		int index;
		int indexOfMin=startIndex;
		for(index=startIndex+1; index<mergedLength;index++) 
			if(merged[index]>min) {
				min=merged[index];
				indexOfMin=index;
				}
			
		return indexOfMin;
	}
	public static void interchange(int i,int j, int[]merged ) {
		int temp;
		temp=merged[i];
		merged[i]=merged[j];
		merged[j]=temp;
	}
	
	public static void sort( int[]merged,int mergedLength ) {
		int index,indexOfSmallest;
		for(index=0; index<mergedLength-1;index++) {
			indexOfSmallest=indexOfSmallest(merged,index,mergedLength);
			interchange(index,indexOfSmallest,merged);
			
		}
	}
}
