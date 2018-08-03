package averagesalary;
import java.util.Scanner;

public class AverageSalary {
	static Scanner keyboard= new Scanner(System.in);
	
	static int[] salary= new int [12];
	static int[] overTimeHours= new int [12];
	
	public static void setSalaryAndHours() {
		for(int i=0;i<12;i++) {
			System.out.println("Enter salary for month "+(i+1)+" :");
			salary[i]=keyboard.nextInt();
			System.out.println("Enter over Time Hours for month "+(i+1)+" :");
			overTimeHours[i]=keyboard.nextInt();
		}
	}
	
	public static void getSalaryAndHours() {
		int average= getAverage();
		int moneyForHours=setSalaryForExtraHours(salary);
		
		for(int i=0;i<12;i++) {
			String month=monthIntToString(salary[i]);
			System.out.println("Salary for month "+month+" is: "+salary[i]+
					" $ and over Time Hours "+overTimeHours[i]+ " "
							+ " h difference is: " +(salary[i]-average)+ " $ money for extra hours is: " +moneyForHours+" $");
		}
	}
	
	public static int getAverage() {
		int total=0;
		for(int i=0;i<12;i++) {
			total=total+salary[i];
			}
		System.out.println("Average is: "+total/12);
		return total/12;
	}
	
	public static int setSalaryForExtraHours(int salary[]) {
		int moneyForHours=0;
		int i;
		for(i=0;i<12;i++) 
			if(salary[i]>10000) {
				moneyForHours=overTimeHours[i]*25;
			
			}
			 if(salary[i]<10000 && salary[i]>5000 ) {
				moneyForHours=overTimeHours[i]*20;
			
			 }
			 if(salary[i]<5000 && salary[i]>2000 ) {
				moneyForHours=overTimeHours[i]*15;
				
			 }
			if(salary[i]<2000 ) {
				moneyForHours=overTimeHours[i]*10;
				
			}
		
		
		return moneyForHours;
	}

	
	public static String monthIntToString(int i) {
		switch(i) {
		case 0:
			return "January";
			case 1:
			return "February";
			case 2:
			return "March";
			case 3:
			return "April";
			case 4:
			return "May";
			case 5:
			return "June";
			case 6:
			return "July";
			case 7:
			return "August";
			case 8:
			return "September";
			case 9:
			return "October";
			case 10:
			return "November";
			case 11:
			return "December";
		}
			return "Error";
	}
}
