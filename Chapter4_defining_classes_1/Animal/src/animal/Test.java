package animal;

public class Test {
	public static void main(String[] args) {
		
	Animal 	input=new Animal(),
			input1= new Animal("Sinan"),
			input3=new Animal("ipce", "zivotinja", 87);
	
	System.out.println(input.toSting());
	System.out.println(input1.toSting());
	System.out.println(input3.toSting());
	
	
}
}