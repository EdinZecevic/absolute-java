package gradeing;
import java.util.Scanner;
public class Gradeing {
	private double quiz1;
	private double percentageqiuz1;
	private double quiz2;
	private double percentageqiuz2;
	private double quiz3;
	private double percentageqiuz3;
	private double midterm;
	private double percentagemidterm;
	private double finall;
	private double percentagefinal;
	private double totalQuizes;
	private double totalGrade;
	Scanner keyboard= new Scanner(System.in);
	
	public void setQuiz1() {
		System.out.println("Enter the quiz 1 grade!");
		quiz1=keyboard.nextDouble();
		if(quiz1<0 && quiz1>10) {
			System.out.println("Enter the valid grade!");
		}
		else {
			percentageqiuz1=quiz1*0.83333;
			System.out.println("The percetage of your first quiz is: " +percentageqiuz1 + " %");
		}
			}
	public double getQuiz1() {
		return percentageqiuz1;
	}
	
	public void setQuiz2() {
		System.out.println("Enter the quiz 2 grade!");
		quiz2=keyboard.nextDouble();
		if(quiz2<0 && quiz2>10) {
			System.out.println("Enter the valid grade!");
		}
		else {
			percentageqiuz2=quiz2*0.83333;
			System.out.println("The percetage of your second quiz is: " +percentageqiuz2 +" %");
		}
			}
	public double getQuiz2() {
		return percentageqiuz2;
	}
	
	public void setQuiz3() {
		System.out.println("Enter the quiz 3 grade!");
		quiz3=keyboard.nextDouble();
		if(quiz3<0 && quiz3>10) {
			System.out.println("Enter the valid grade!");
		}
		else {
			percentageqiuz3=quiz3*0.83333;
			System.out.println("The percetage of your third quiz is: " +percentageqiuz3 +" %");
		}
			}
	public double getQuiz3() {
		return percentageqiuz3;
	}
	
	public void setMidterm() {
		System.out.println("Enter the midterm grade!");
		midterm=keyboard.nextDouble();
		if(midterm<0 && midterm>100) {
			System.out.println("Enter the valid grade!");
		}
		else {
			percentagemidterm=midterm*0.35;
			System.out.println("The percetage of your midterm is: " +percentagemidterm + " %");
		}
			}
	public double getMidterm() {

		return percentagemidterm;
	}

	public void setFinal() {
		System.out.println("Enter the final grade!");
		finall=keyboard.nextDouble();
		if(finall<0 && finall>100) {
			System.out.println("Enter the valid grade!");
		}
		else {
			percentagefinal=finall*0.40;
			System.out.println("The percetage of your final is: " +percentagefinal + " %");
		}
			}
	public double getFinal() {
		return percentagefinal;
	}
	
	public void totalQuizes() {
		totalQuizes=this.getQuiz1()+this.getQuiz2()+this.getQuiz3();
		System.out.println("Your total percetage from quizes is: "+totalQuizes+ " out of 25% ");
	}

	public double getQuizes() {
		return totalQuizes;
	}
	public double totalGrade() {
		totalGrade=this.getQuizes()+this.getMidterm()+this.getFinal();
		return totalGrade;
	}

	public void printGrade() {
		if(this.totalGrade()<=100 && this.totalGrade()>=90) {
			System.out.println("Your total score is " + this.totalGrade()+ " and it is grade A " );
	}
		else if(this.totalGrade()<90 && this.totalGrade()>=80) {
			System.out.println("Your total score is " + this.totalGrade()+ " and it is grade B " );
	}
		else if(this.totalGrade()<80 && this.totalGrade()>=70) {
			System.out.println("Your total score is " + this.totalGrade()+ " and it is grade C " );
	}
		else if(this.totalGrade()<70 && this.totalGrade()>=60) {
			System.out.println("Your total score is " + this.totalGrade()+ " and it is grade D " );
	}
		else if(this.totalGrade()<60 && this.totalGrade()>=0) {
			System.out.println("Your failed with " + this.totalGrade()+ " score and it is grade F " );
	}
		
}
}

