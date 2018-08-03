package sumberofnumbers;

public class Test {
	public static void main(String[] args) {
		int[] first=new int[15];
		int[] second=new int[15];
		int[] merged=new int[30];
		

		NumberOfNumbers.setNumbersFirst(first);
		System.out.println("");
		NumberOfNumbers.setNumbersSecond(second);
		System.out.println("");
		NumberOfNumbers.setNumbersMerged(first,second,merged);
		System.out.println("");
		
		
		NumberOfNumbers.sort(merged, merged.length);
		
		NumberOfNumbers.countNumbers(merged);33
		
		
	}
}
