package wordCount;
import java.util.Scanner;
import java.util.StringTokenizer;
public class WordCount {
	private String delimiters;
	private String sentence;
	private int counter;
	Scanner keyboard= new Scanner(System.in);
	
	public void setSentence() {
		sentence=keyboard.nextLine();
	}
	public void setCounter() {
		counter=0;
	}
	public void setCounterNoNegative() {
		if(counter<0) {
			System.out.println("Error");
		}
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void StringTokenizer(String input, String delimiters) {
		
			StringTokenizer countWords = new StringTokenizer(input, delimiters);
			int count= countWords.countTokens();
			System.out.println(count);
}
	
	public void StringTokenizer1(String input, String delimiters) {
		counter=0;
		while(delimiters=="a") {
				counter++;
}
		System.out.println(counter);
}
	public void StringTokenizer12(String input, String delimiters) {
		counter=0;
		if(delimiters=="A") {
				counter++;
}
		System.out.println(counter);+;
}	
}
