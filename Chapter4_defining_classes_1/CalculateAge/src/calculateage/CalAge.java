package calculateage;
import java.util.*; 
public class CalAge {
		public double day;
		public double month;
		public double year;
		Scanner keyboard= new Scanner(System.in);

	public void setDate(){
		day= keyboard.nextDouble();
		month=keyboard.nextDouble();
		year=keyboard.nextDouble();
	}
	
	
		public Double getDay(){
			return day;
		}
		public Double getMonth(){
			return month;
		}
		public Double getYear(){
			return year;
		}
	
		public double returnAge() {
			double totalage;
	totalage=((this.getYear()*12)+this.getMonth())/12;
	System.out.println("Your total age is: " +totalage);
	return totalage;
}
		
		public void checkDate() {
			if(this.getYear()<=0) {
				System.out.println("Incorrect year!");
			}
			else if ((this.getMonth()>13) && (this.getMonth()<=0)){
				System.out.println("Incorrect month!");
			}
			else if ((this.getMonth()==1) && (this.getDay()<=0) && (this.getDay()>31)){
				System.out.println("Incorrect day!");
			}
			else if ((this.getMonth()==2) && (this.getDay()<=0) && (this.getDay()>28)){
				System.out.println("Incorrect day!");
			}
			else if ((this.getMonth()==3) && (this.getDay()<=0) && (this.getDay()>31)){
				System.out.println("Incorrect day!");
			}
			else if ((this.getMonth()==4) && (this.getDay()<=0) && (this.getDay()>30)){
				System.out.println("Incorrect day!");
			}
			else if ((this.getMonth()==5) && (this.getDay()<=0) && (this.getDay()>31)){
				System.out.println("Incorrect day!");
			}
			else if ((this.getMonth()==6) && (this.getDay()<=0) && (this.getDay()>30)){
				System.out.println("Incorrect day!");
			}
			else if ((this.getMonth()==7) && (this.getDay()<=0) && (this.getDay()>31)){
				System.out.println("Incorrect day!");
			}
			else if ((this.getMonth()==8) && (this.getDay()<=0) && (this.getDay()>30)){
				System.out.println("Incorrect day!");
			}
			else if ((this.getMonth()==9) && (this.getDay()<=0) && (this.getDay()>31)){
				System.out.println("Incorrect day!");
			}
			else if ((this.getMonth()==10) && (this.getDay()<=0) && (this.getDay()>31)){
				System.out.println("Incorrect day!");
			}
			else if ((this.getMonth()==11) && (this.getDay()<=0) && (this.getDay()>30)){
				System.out.println("Incorrect day!");
			}
			else if ((this.getMonth()==12) && (this.getDay()<=0) && (this.getDay()>31)){
				System.out.println("Incorrect day!");
			}
			
		}
		
		
	}