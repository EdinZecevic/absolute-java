package sumberofnumbers;

import java.util.Scanner;

public class NumberOfNumbers {
	static Scanner keyboard= new Scanner(System.in);
	

	
	public  static void setNumbersFirst(int[]first){
		int i;
		for(i=0; i<first.length;i++) {
			System.out.println("Enter the "+(i+1)+" number");
			first[i]=keyboard.nextInt();
		}
		}
		
	public  static void  setNumbersSecond(int[]second){
		int i;
		for(i=0; i<second.length;i++) {
			System.out.println("Enter the "+(i+1)+" number");
			second[i]=keyboard.nextInt();
		}
	}
	
	public  static void setNumbersMerged(int[]first,int[]second,int[]merged){
		int i;
		for(i=0; i<15;i++) {
			merged[i]=first[i];
		}
		int j=0;
		for(i=15; i<30;i++) {
			merged[i]=second[j];
			j++;
			}
		}
	
	
	public static void countNumbers(int[]merged) {
	int counter = 1;
		for(int i=0; i<merged.length; i++) {
			counter = 0;
			for(int j=0; j<merged.length; j++) {
			if(merged[i]==merged[j]) {
				counter++;
			}
			}
			System.out.println(merged[i]+"  "+counter);
		
		}
}

	
	
	public static int indexOfSmallest(int [] merged, int startIndex, int mergedLength) {
		double min =merged[startIndex];
		int index;
		int indexOfMin=startIndex;
		for(index=startIndex+1; index<mergedLength;index++) 
			if(merged[index]<min) {
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
