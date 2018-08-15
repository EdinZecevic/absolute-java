package person;

public class Test {
	public static void main(String[] args) {
		Person person=new Person("Sinan","Sakic"),
				person1=new Person("Jasar","Ahmedovski");
		Student student=new Student(140302157,"Matematika","Sadeta Bukva"),
				student1=new Student(187995246,"Geografija","Alisa Buric");
		Teacher teacher=new Teacher("Matematika",2000),
				teacher1=new Teacher("Geografija",3000);
		
		
		System.out.println(person.displayDetails());
		System.out.println(person1.displayDetails());
		System.out.println(student.displayDetails());
		System.out.println(student1.displayDetails());
		System.out.println(teacher.displayDetails());
		System.out.println(teacher1.displayDetails());
		
		
		
	
	
	}
}
