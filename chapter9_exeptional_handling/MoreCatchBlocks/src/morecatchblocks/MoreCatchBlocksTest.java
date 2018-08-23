package morecatchblocks;
import java.util.Scanner;

public class MoreCatchBlocksTest {
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		
		try {
			System.out.println("How many pencils do you have");
			int pencils=keyboard.nextInt();
			
			if(pencils<0)
				throw new NegativeNumberExeption();
			
			System.out.println("How many earsers do you have");
			int erasers=keyboard.nextInt();
			double pencilsPerErasers;
			
			if(erasers<0)
				throw new NegativeNumberExeption("erasers");
			else if(erasers!=0)
				pencilsPerErasers=pencils/(double )erasers;
			else 
				throw new DivisionByZeroExeption();
			
			System.out.println("Each eraser must last through "+pencilsPerErasers+" pencils ");
		}
		catch(NegativeNumberExeption e) {
			System.out.println("Can not have a negative number of "+e.getMessage());
		}
		catch(DivisionByZeroExeption e) {
			System.out.println("Dont make mistakes ");
		}
		System.out.println("ende");
	}
}
