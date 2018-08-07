package call;

public class Internationalcall {
	
	public double getPrice(double getDurationTotal) {
		if(getDurationTotal<=1) {
			return 0.60;
		}
		else if(getDurationTotal>1 && getDurationTotal<=2) {
			return 0.40*2;
		}
		else if(getDurationTotal>2) { 
			return getDurationTotal*0.20;
		}
		else
			return 0;
	}
	public double DiscountCall(double getDurationTotal) {
		if(getDurationTotal>10 && getDurationTotal<=20) { 
			return (((getDurationTotal*0.10)*8)/100);
		}
		else if(getDurationTotal>20) { 
			return (((getDurationTotal*0.10)*10)/100);
		}
		else
			return 0;
	}
}
