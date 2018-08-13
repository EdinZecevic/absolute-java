package numbersofnumbers;



public class Test {
	public static void main(String[] args) {
		int[] array=new int[50];
		
		NumbersOfNumbers2.setNumbers(array);
		System.out.println("");
		
		NumbersOfNumbers2.countNumbers(array);
		NumbersOfNumbers2.sort(array, array.length);
	}

}