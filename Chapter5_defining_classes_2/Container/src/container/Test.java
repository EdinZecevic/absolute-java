package container;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int capacity=100;
		int quantity=80;
		Container 	inputt=new Container();
		
		Container 	input=new Container(),
					input1=new Container(100),
					input2=new Container(100,80);
		
		int input3= input2.emptyContainer();
		String input4= input2.fillContainer(quantity);
		
		System.out.println(input.toString());
		System.out.println(input1.toString());
		System.out.println(input2.toString());
		System.out.println(input3);
		System.out.println(input4);
		System.out.println("In KIloliters");
		System.out.println(inputt.getQuantitiyKiloliters(quantity));
		
		
						
		
		
	}

}
