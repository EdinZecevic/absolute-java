package teacher;

public class Test {

	public static void main(String[] args) {
		
		Teacher Teacher=new Teacher("Sinan", "Sakic", 200, 2000);
		PhysicsTeacher PhysicsTeacher= new PhysicsTeacher("Amir", "Sakic", 200, 2000, 2.2);
		HistoryTeacher HistoryTeacher= new HistoryTeacher("Gutic", "Sakic", 200, 2000);
		
		System.out.println(Teacher.getName());
		System.out.println(PhysicsTeacher.getName());
		System.out.println(HistoryTeacher.getName());
		
		
	}
}
