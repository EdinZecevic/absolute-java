package administrator;
import java.util.Scanner;
public class Test {
	
	public static void main(String[] args) {
		String newName;
		int newSalary;
		String administratorTitle;
		String areaOfResponsibility;
		String nameOfSupervisor;
		
		Date Date = new Date ();
		
		
		Administrator Administrator = new Administrator();
		
		Employee Employee= new Employee();
		
		SalariedEmployee SalariedEmployee=new SalariedEmployee();
		
		Scanner keyboard= new Scanner(System.in);
		
		System.out.println("Enter Administrators Name: ");
		newName=keyboard.nextLine();
		Employee.setName(newName);
		
		System.out.println("Enter Administrators Salary: ");
		newSalary=keyboard.nextInt();
		SalariedEmployee.setSalary(newSalary);
		
		System.out.println("Enter Administrators Title: ");
		administratorTitle=keyboard.nextLine();
		Administrator.setAdministratorTitle(administratorTitle);
		
		System.out.println("Enter Area Of Responsibility Title: ");
		areaOfResponsibility=keyboard.nextLine();
		Administrator.setAreaOfResponsibility(areaOfResponsibility);
		
		System.out.println("Enter Name Of Supervisor Title: ");
		nameOfSupervisor=keyboard.nextLine();
		Administrator.setNameOfSupervisor(nameOfSupervisor);
		
		String title=Administrator.getAdministratorTitle();
		String area=Administrator.getAreaOfResponsibility();
		String supervisor=Administrator.getNameOfSupervisor();
		
		System.out.println(title);
		System.out.println(area);
		System.out.println(supervisor);
	}
}
