package administrator;

public class TitledEmployee extends SalariedEmployee {
	
	private String Titile;
	
	
	public TitledEmployee(Date newDate) {
		Titile="no title";
	}

	public TitledEmployee(String theName, double theSalaray, Date theDate, String theTitle) {
		super(theName,theDate,theSalaray);
		this.Titile=theTitle;
	}
	
	public String getTitle() {
		return Titile;
	}
	
	public void setTitle(String Title) {
		this.Titile=Title;
	}
	
	public String getName(String Title) {
		return(super.getName()+""+Title);
	}

}
