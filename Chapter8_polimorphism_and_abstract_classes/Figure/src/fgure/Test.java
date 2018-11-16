package fgure;

public class Test {
	public static void main(String [ ] args){
		
		Figure figure= new Figure(20,20);
		Circle circle= new Circle(30,30,30);
		Triangle triangle= new Triangle(5,6,7,40,40);
		
		System.out.println(figure.getArea());
		System.out.println(circle.getArea());
		System.out.println(triangle.getArea());
		
		System.out.println(triangle.getArea());
		System.out.println(circle.getAreaOfCircuit());
	}
}