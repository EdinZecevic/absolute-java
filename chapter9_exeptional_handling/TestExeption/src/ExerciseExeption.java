
public class ExerciseExeption extends Exeption{
	
	ExerciseExeption(){
		super("Exercise Exeption thrown");
		System.out.println("Exeption thrown");
	}
	ExerciseExeption(String message){
		super(message);
		System.out.println("ExerciseExeption invoked with an argument");
	}

}
