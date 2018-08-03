package journal;
import java.util.StringTokenizer;
public class Test {
	public static void main(String[] args) {

	Journal input = new Journal();
	
	//System.out.println("Enter name of author: ");
	//input.setName();
	System.out.println("Enter the title: ");
	input.setTitle();
	//System.out.println("Enter the date of publishong! ");
	//input.setDate();
	
	//input.getDate();
	//String name= input.getName();
	//System.out.println("The Name od author is: " +name);
	//String title= input.getTitle();
	//System.out.println("The title of the book is: " +title);
	
	
	titleTokens = new StringTokenizer(input.getTitle());
	System.out.println(titleTokens);
	

}

	
}
