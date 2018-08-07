package call;

public class NationalCall {
	private long SourcePhoneNumber;
	private long DestinationPhoneNumber;
	private int DurationInSeconds;
	private int DurationTotal;
	private int PriceOfCall;
	private int PriceOfAllCals;
	
	public NationalCall(){
		SourcePhoneNumber=0;
		DestinationPhoneNumber=0;
		DurationInSeconds=0;
	}
	
	
	public int setSourcePhoneNumber(int SourcePhoneNumber) {
		this.SourcePhoneNumber=SourcePhoneNumber;
		return SourcePhoneNumber;
	}
	public int setDestinationPhoneNumber(int DestinationPhoneNumber) {
		this.DestinationPhoneNumber=DestinationPhoneNumber;
		return DestinationPhoneNumber;
	}
	public int setDurationInSeconds(int DurationInSeconds) {
		this.DurationInSeconds=DurationInSeconds;
		return DurationInSeconds;
	}
	public int setDurationTotal(int DurationTotal) {
		this.DurationTotal=DurationTotal;
		return DurationTotal;
	}
	public int setPriceOfCall(int PriceOfCall) {
		this.PriceOfCall=PriceOfCall;
		return PriceOfCall;
	}
	public int setPriceOfAllCals(int PriceOfAllCals) {
		this.PriceOfAllCals=PriceOfAllCals;
		return PriceOfAllCals;
	}

	public long getSourcePhoneNumber() {
		return SourcePhoneNumber;
	}
	public long getDestinationPhoneNumber() {
		return DestinationPhoneNumber;
	}
	public int getDurationInSeconds() {
		return DurationInSeconds;
	}
	public double getDurationTotal(int DurationInSeconds) {
		double totalDuration = 0;
		double duration=DurationInSeconds%60;
		if(duration>9) {
			totalDuration=duration/100;
		}
      return (DurationInSeconds/60)+(totalDuration);
	}
	public int getPriceOfCall() {
		return PriceOfCall;
	}
	public int getPriceOfAllCals() {
		return PriceOfAllCals;
	}

	public double getPrice(double getDurationTotal) {
		if(getDurationTotal<=1) {
			return 0.20;
		}
		else if(getDurationTotal>1 && getDurationTotal<=2) {
			return 0.15*2;
		}
		else if(getDurationTotal>2) { 
			return getDurationTotal*0.10;
		}
		else
			return 0;
	}
	public double DiscountCall(double getDurationTotal) {
		if(getDurationTotal>10 && getDurationTotal<=20) { 
			return (((getDurationTotal*0.10)*5)/100);
		}
		else if(getDurationTotal>20) { 
			return (((getDurationTotal*0.10)*7)/100);
		}
		else
			return 0;
	}
	}
