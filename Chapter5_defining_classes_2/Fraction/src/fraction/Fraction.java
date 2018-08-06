package fraction;

public class Fraction {
	
	@SuppressWarnings("unused")
	private int numerator;
	@SuppressWarnings("unused")
	private int denominator;
	private int resault;
	private int resault1;
	
	public void setNumerator(int numerator) {
		this.numerator=numerator;
	}
	public void setDenominator(int denominator) {
		this.denominator=denominator;
	}
	
	public void setBooth(int numerator,int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	public String toString(int numerator,int denominator) {
		return(numerator+"/"+denominator);
	}
	
	public String reducetToLowestTerms(int numerator,int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
		if(denominator%numerator==0) {
			resault=denominator/numerator;
			return(1+"/"+resault);
		}
		else if(denominator%numerator!=0) {	
		return(numerator+"/"+denominator);
		}
		else if(numerator%denominator==0) {
			resault1=numerator/denominator;
			return (resault1+"");
		}
		else
			return null;
	}
	
	public String chechEqualities(int numerator, int numerator1, int denominator, int denominator1) {
		if(numerator==numerator1 && denominator==denominator1) {
			return("They are equal");
		}
	else
		return("They are not equal");
}
}