package journal;
public class Test {
	public static void main(String[] args) {
		
		Journal input=new Journal("sinan", "sakic u zraku", 1, 3, 1995);
		System.out.println(input.toString());
		input.setDay(1);
		input.setMonth(82);
		input.setYear(1995);
		
		String sinan=input.getDate();
		System.out.println(sinan);--
}	
}
