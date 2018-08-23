
public class DoubleExeption extends Exeption{

	private double doubleMessage;
	
	public DoubleExeption() {
		super("Double exeption thrown1");
	}
	
	public DoubleExeption(String message) {
		super(message);
	}
	
	public DoubleExeption(double number) {
		super("Double exeption thrown!");
		doubleMessage=number;
	}
	
	public double getNumber() {
		return doubleMessage;
	}
}
