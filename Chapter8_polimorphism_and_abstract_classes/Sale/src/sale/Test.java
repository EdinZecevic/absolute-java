package sale;

public class Test {
	public static void main(String [ ] args){
		Sale sale= new Sale("cips", 20);
		DiscountSale DiscountSale = new DiscountSale("cips", 20,5);
		
		
		System.out.println(DiscountSale.getBill());
		
		
	}

}