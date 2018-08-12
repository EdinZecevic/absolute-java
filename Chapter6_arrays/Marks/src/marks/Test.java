package marks;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		Marks input=new Marks();
		int [] marks =new int [5];
		String StudentName;
		int id;
		
		System.out.println("Enter students name: ");
		StudentName=keyboard.nextLine();
		
		System.out.println("Enter students Id: ");
		id=keyboard.nextInt();
		
		input.setNameId(StudentName, id);
		
		input.setMarks(marks);
		input.validateMarks(marks);
		
	}

}
