package administrator;

public class Administrator extends SalariedEmployee{
	private String administratorTitle;
	private String areaOfResponsibility;
	private String nameOfSupervisor;
	
	public Administrator(){
		administratorTitle="Empty";
		areaOfResponsibility="Empty";
		nameOfSupervisor="Empty";
	}
	
	public void setAdministratorTitle(String administratorTitle) {
		this.administratorTitle=administratorTitle;
	}
	public String getAdministratorTitle() {
		return administratorTitle;
	}

	public void setAreaOfResponsibility(String areaOfResponsibility) {
		this.areaOfResponsibility=areaOfResponsibility;
	}
	public String getAreaOfResponsibility() {
		return areaOfResponsibility;
	}

	public void setNameOfSupervisor(String nameOfSupervisor) {
		this.nameOfSupervisor=nameOfSupervisor;
	}
	public String getNameOfSupervisor() {
		return nameOfSupervisor;
	}
}
