package courieragency;
import java.util.Scanner;

public class CourierAgency {
	Scanner keyboard= new Scanner(System.in);
	
	private static final int  stampWeightPer1Kg=2;
	private static final int  city=20;
	private static final int  country=40;
	private String city1="city";
	private String country1="country";
	
	float[] stampWeight=new float[5];
	
	public void setWeightOfParcels() {
	for(int i=0; i<5;i++) {
		System.out.println("Enter weight of parcel number : "+(i+1));
		stampWeight[i]=keyboard.nextFloat();
	}
	}
	
	public void getWeightOfParcels() {
		for(int i=0; i<5;i++) 
		System.out.println("Entered weight for parcel number " +(i+1)+ " is: " +stampWeight[i]);
	}
	
	public String checkCityOrCountry(String nameOfPlace) {
		if(nameOfPlace.equals(city1)) {
			return city1;
		}
		else
			return country1;
		
	}
	
	public void setPriceForPlace(String nameOfPlace) {
		for(int i=0; i<5;i++) {
		if(nameOfPlace.equals(city1)) {
			float city2=stampWeight[i]+20;
			System.out.println("Price for city is: " +city2);
		}
		else if(nameOfPlace.equals(country1)) {
			 float country2=stampWeight[i]+40;
			System.out.println("Price for city is: " +country2);
		}
		}
	}

}

