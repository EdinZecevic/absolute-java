package vehicle;

public class Test {
	public static void main(String[] args) {
	Vehicle input= new Vehicle();
	
	
	int getFuel= input.getFuelInTank();
	System.out.println(getFuel);
	input.driveTo();
	
	}
}
