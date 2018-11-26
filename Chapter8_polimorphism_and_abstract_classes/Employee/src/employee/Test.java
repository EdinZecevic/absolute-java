package employee;

public class Test {
	public static void main(String[] args) {
		Employee[] array=new Employee[15];
		double [] total=new double[15];
		double [] persentage=new double[15];
		array[0]=new Employee("Edin",14030,"Menagment", 200,"Menager",15);
		array[1]=new Employee("Edin",14030,"Menagment", 200,"Menager",15);
		
		array[2]=new Employee("Edin",14030,"Menagment", 200,"Menager",15);
		array[3]=new Employee("Edin",14030,"Menagment", 200,"Menager",15);
		array[4]=new Employee("Edin",14030,"Menagment", 200,"Menager",12);
		array[5]=new Employee("Edin",14030,"Menagment", 200,"Menager",15);
		
		array[6]=new Menager("Edin",14030,"Menagment", 200,"Menager",12);
		array[7]=new Menager("Edin",14030,"Menagment", 200,"Menager",12);
		array[8]=new Menager("Edin",14030,"Menagment", 200,"Menager",15);
		array[9]=new Menager("Edin",14030,"Menagment", 200,"Menager",12);
		
		array[10]=new Clerk("Edin",14030,"Menagment", 200,"Menager",12);
		array[11]=new Clerk("Edin",14030,"Menagment", 200,"Menager",12);
		array[12]=new Clerk("Edin",14030,"Menagment", 200,"Menager",15);
		array[13]=new Clerk("Edin",14030,"Menagment", 200,"Menager",12);
		array[14]=new Clerk("Edin",14030,"Menagment", 200,"Menager",15);
		
		Employee Employee= new Menager("Edin",14030,"Menagment", 200,"Menager",15);
		Menager Menager= new Menager("Edin",14030,"Menagment", 200,"Menager",15);
		Clerk Clerk= new Clerk("Edin",14030,"Menagment", 200,"Menager",15);
		System.out.println("Equals method for designation ");
		System.out.println(Menager.equals(Clerk));
		System.out.println("Bonus default ");
		System.out.println(Employee.addBonus());
		System.out.println("Bonus for Menager ");
		System.out.println(Menager.addBonus());
		System.out.println("Bonus for Clerk ");
		System.out.println(Clerk.addBonus());
		
		for(int i=0; i<array.length;i++) {
			persentage[i]=(((20-array[i].getDeduction())*100)/20);//calculates the percentage of deduction per month if assume that there is 20 working days
			total[i]=array[i].getSalary()*persentage[i]/100.0;//calculates the total salary taking form it the percentage of deduction
		}
		
		int counter=0;
		for(int i=0; i<array.length;i++) {
			counter=counter+array[i].getDeduction();
			System.out.println("Name: "+array[i].getName()+", Class: "+array[i].getClass()+", Salary: "
			+array[i].getSalary()+", Name: "+array[i].getName()+", Salary with deduction: "+total[i]+", Bonus: "+array[i].getBonus()
			+", Total Salary with deduction and Bonus: "+(total[i]+array[i].getBonus()));
		}
		
		System.out.println("Total Deduction of all workes");
		System.out.println(counter);
	 	
	}

}
