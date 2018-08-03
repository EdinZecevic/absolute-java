package employee;

public class Test {
	public static void main(String[] args) {
		Employee 	employee =new Employee(),
					employee1 =new Employee("Sinan"), 
					employee2 =new Employee("Sinan",1456987), 
					employee3 =new Employee("Sinan",1456987,"energetics"), 
					employee4 =new Employee("Sinan",1456987,"energetics",2222.25), 
					employee5 =new Employee("Sinan",1456987,"energetics",2222.25,"menager");
					employee =new Employee("Sinan",1456987,"energetics",2222.25,"menager");
		
		System.out.println(employee.toString());
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
		System.out.println(employee4.toString());
		System.out.println(employee5.toString());
		System.out.println(employee.toString());
		
		
		String equals= employee.equals(employee.getDesignation(),employee5.getDesignation());
		
		System.out.println(equals);
		
		Employee ho=new Menager(),
				 fo=new Clerk();
		
		double salary=employee.setSalaryFor("Menager", 20 , ho);
		double salary1=employee.setSalaryFor("Clerk", 20 , fo);
		System.out.println(salary);
		System.out.println(salary1);
		
	}

}
