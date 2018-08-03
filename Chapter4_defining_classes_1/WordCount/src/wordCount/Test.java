package wordCount;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		WordCount insert= new WordCount();
		String input= keyboard.nextLine();
		String delimiters2= " ";
		String delimiters= "A";
		String delimiters1= "a";
	
		
		StringTokenizer countWords = new StringTokenizer(input, delimiters2);
		int count= countWords.countTokens();
		System.out.println(count);
		
		insert.StringTokenizer1(input, delimiters);
		insert.StringTokenizer12(input, delimiters1);
	}

}
