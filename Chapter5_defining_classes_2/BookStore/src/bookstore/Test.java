package bookstore;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard= new Scanner(System.in);
		
		String bookCategory;
		String author;
		String title;
		String publisher;
		double price;
		int quantity;
		
		System.out.println("Enter Book Category: ");
		bookCategory=keyboard.nextLine();
		System.out.println("Enter author: ");
		author=keyboard.nextLine();
		System.out.println("Enter title: ");
		title=keyboard.nextLine();
		System.out.println("Enter publisher: ");
		publisher=keyboard.nextLine();
		System.out.println("Enter price: ");
		price=keyboard.nextDouble();
		System.out.println("Enter quantity: ");
		quantity=keyboard.nextInt();
		
		BookStore 	input1= new BookStore(),
					input2= new BookStore(bookCategory),
					input3= new BookStore(bookCategory,author),
					input4= new BookStore(bookCategory,author,title),
					input5= new BookStore(bookCategory,author,title,publisher),
					input6= new BookStore(bookCategory,author,title,publisher,price),
					input7= new BookStore(bookCategory,author,title,publisher,price,quantity);
		
		System.out.println(input1.toString());
		System.out.println(input2.toString());
		System.out.println(input3.toString());
		System.out.println(input4.toString());
		System.out.println(input5.toString());
		System.out.println(input6.toString());
		System.out.println(input7.toString());
		
		System.out.println("Number of sold books: "+BookStore.numberOfSoldBooks());
				
	}
}
