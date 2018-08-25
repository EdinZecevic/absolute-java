package caltheaverage;

public class CalTheAverage extends Average {
	
	private double average;
	
	CalTheAverage (){
		super("N must be positive");
	}
	
	CalTheAverage (int sum,int counter){
		super(sum,counter);
	}
	
	
	public static String getMessage() {
		return ("N must be positive");
	}
	
	public double average (int sum,int counter){
		double average=sum/counter;
		return average;
	}
	

	public void setAverage(double average) {
		this.average=average;
	}

}
