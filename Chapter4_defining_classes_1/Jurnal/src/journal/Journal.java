package journal;
public class Journal {
	private String nameOfAuthor;
	private String titleOfPaper;
	
	private int day;
	private int month;
	private int year;
	
	Journal(String nameOfAuthor,String titleOfPaper,int day,int month,int year){
		setNameOfAuthor(nameOfAuthor);
		setTitleOfPaper(titleOfPaper);
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	public void setNameOfAuthor(String nameOfAuthor) {
		this.nameOfAuthor=nameOfAuthor;
	}
	public void setTitleOfPaper(String titleOfPaper) {
		this.titleOfPaper=titleOfPaper;
	}
	
	public void setDay(int day) {
		if(day<=0 && day>31) {
			System.out.println("Enter the correct day!");
		}
		else {
		this.day=day;
		}
	}
	public void setMonth(int month) {
		if(month<=0 && month>12) {
			System.out.println("Enter the correct month!");
		}
		else {
		this.month=month;
		}
	}
	public void setYear(int year) {
		if(year<=0 && year>10000) {
			System.out.println("Enter the correct year!");
		}
		else {
		this.year=year;
		}
	}
	
	public String getNameOfAuthor() {
		return nameOfAuthor;
	}
	public String getTitleOfPaper() {
		return titleOfPaper;
	}

	public int getDay() {
	return day;
	}
	public int getMonth() {
	return month;
	}
	public int getYear() {

	return year;
	}
	
	public String checkDate() {
		if(this.getYear()<=0) {
			return ("Incorrect year!");
		}
		else if ((this.getMonth()>13) && (this.getMonth()<=0)){
			return ("Incorrect month!");
		}
		else if ((this.getMonth()==1) && (this.getDay()<=0) && (this.getDay()>31)){
			return ("Incorrect day!");
		}
		else if ((this.getMonth()==2) && (this.getDay()<=0) && (this.getDay()>28)){
			return ("Incorrect day!");
		}
		else if ((this.getMonth()==3) && (this.getDay()<=0) && (this.getDay()>31)){
			return ("Incorrect day!");
		}
		else if ((this.getMonth()==4) && (this.getDay()<=0) && (this.getDay()>30)){
			return ("Incorrect day!");
		}
		else if ((this.getMonth()==5) && (this.getDay()<=0) && (this.getDay()>31)){
			return ("Incorrect day!");
		}
		else if ((this.getMonth()==6) && (this.getDay()<=0) && (this.getDay()>30)){
			return ("Incorrect day!");
		}
		else if ((this.getMonth()==7) && (this.getDay()<=0) && (this.getDay()>31)){
			return ("Incorrect day!");
		}
		else if ((this.getMonth()==8) && (this.getDay()<=0) && (this.getDay()>30)){
			return ("Incorrect day!");
		}
		else if ((this.getMonth()==9) && (this.getDay()<=0) && (this.getDay()>31)){
			return ("Incorrect day!");
		}
		else if ((this.getMonth()==10) && (this.getDay()<=0) && (this.getDay()>31)){
			return ("Incorrect day!");
		}
		else if ((this.getMonth()==11) && (this.getDay()<=0) && (this.getDay()>30)){
			return ("Incorrect day!");
		}
		else if ((this.getMonth()==12) && (this.getDay()<=0) && (this.getDay()>31)){
			return ("Incorrect day!");
		}
		else
			return ("Date is Correct!");
		
	}

	public String toString () {
		return(nameOfAuthor+" "+titleOfPaper+" "+day+" "+month+" "+year);
	}
	public String getDate() {
		return(day+" "+month+" "+year);
	}
}
