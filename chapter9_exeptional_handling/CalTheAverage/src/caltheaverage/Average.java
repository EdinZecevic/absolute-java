package caltheaverage;

public class Average {
	
	private String message="N must be positive";
	private double average;
	
	Average(){
		
	}
	
	Average(String message){
		System.out.println(message);
	}
	
	Average(int sum,int counter){
		setAverage(sum,counter);
	}
	
	public void setAverage(int sum,int counter) {
		double average=sum/counter;
		this.average=average;
		
	}
	public double getAverage() {
		return average;
	}

}
