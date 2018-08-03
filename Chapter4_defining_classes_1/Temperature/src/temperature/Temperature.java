package temperature;
import java.util.Scanner;
public class Temperature {
	Scanner keyboard= new Scanner(System.in);
	
	private float temperature;
	private char scale;
	
	
	public Temperature() {
		temperature=0;
		scale= 'C';
	}
	
	public Temperature(char scale) {
		setScale(scale);
		}
	
	public Temperature(float temperature) {
		setTemperature(temperature);
		}
	
	public Temperature(char scale,float temperature) {
		setBooth(temperature,scale);
		}
	
	public void setTemperature(float temperature) {
		this.temperature=temperature;
	}
	
	public void setScale(char scale) {
		if(scale!='C' && scale!='F') {
			System.out.println("Error wrong scale");
		}
		else
			this.scale=scale;
	}
	
	public void setBooth(float temperature,char scale) {
		this.temperature=temperature;
		this.scale=scale;
	}
	
	public String toString() {
		return(temperature+", "+scale);
	}

	
	public float getTemperatureAll(char scale,float temperature) {
		this.temperature=temperature;
		this.scale=scale;
		
		if(scale=='C') {
			temperature=(9*(temperature/5))+32;
			}
		else if (scale=='F') {
			temperature=(5*(temperature-32))/9;
		}
		return temperature;
	}
	public float getTemperature() {
	return temperature;
}
	public char getScale() {
	return scale;
	}
}