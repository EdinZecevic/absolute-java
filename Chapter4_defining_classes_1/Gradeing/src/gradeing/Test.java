package gradeing;

public class Test {
	public static void main(String[] args) {
	
	Gradeing grades = new Gradeing();
	grades.setQuiz1();
	grades.setQuiz2();
	grades.setQuiz3();
	
	grades.totalQuizes();
	
	grades.setMidterm();
	grades.setFinal();
	
	grades.printGrade();
	
	
	
	}
}
