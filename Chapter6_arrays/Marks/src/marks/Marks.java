package marks;

import java.util.Scanner;

public class Marks {
	private String StudentName;
	private int id;
	int[] marks =new int [5];
	
	Scanner keyboard= new Scanner(System.in);
	
	public void setNameId(String StudentName,int id) {
		this.StudentName=StudentName;
		this.id=id;
	}
	
	public void setMarks(int marks[]) {
		for(int i=0; i<marks.length; i++) {
			System.out.println("Enter mark od exam number "+(i+1)+": ");
			marks[i]=keyboard.nextInt();
		}
	}

	public void validateMarks(int marks[]) {
		for(int i=0; i<marks.length; i++) {
			if(marks[i]<=0) {
				marks[i]= 0;
			}
			else if(marks[i]>=100){
				marks[i]= 0;
			}
					System.out.println("Marks number "+(i+1)+": "+marks[i]);
		}
	}


}
