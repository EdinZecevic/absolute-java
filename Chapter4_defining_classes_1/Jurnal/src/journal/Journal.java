package journal;

import java.util.Scanner;

public class Journal {
	Scanner keyboard= new Scanner(System.in);
	String name;
	String title;
	int date;
	
	int day;
	int month;
	int year;
	
	
	public String displayDetails() {
		this.getDate();
		this.getTitle();
		return name;
	}
	
	public String setName() {
		name=keyboard.nextLine();
		return name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	public String setTitle() {
		title=keyboard.nextLine();
		return title;
	}
	
	public int setDate() {
		System.out.println("Enter the day of publishong: ");
		day= keyboard.nextInt();
		System.out.println("Enter the month of publishong: ");
		month=keyboard.nextInt();
		System.out.println("Enter the year of publishong: ");
		year=keyboard.nextInt();
		this.checkDate();
		return 0;
	}
	
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	
	public void getDate(){
		System.out.println(day+ "." +month+ "." +year+ ".");
		
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
