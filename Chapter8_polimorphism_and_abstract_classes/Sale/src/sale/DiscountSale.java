package sale;

public class DiscountSale extends Sale{
	private double discount;

	public DiscountSale(){
	super();
	}

	public DiscountSale(String _name,double _price, double _discount){
	super(_name,_price);
	discount=_discount;
	}

	public DiscountSale(DiscountSale discountSale){
	super(discountSale);
	discount=discountSale.discount;
	}
	public void setDiscount(double _discount){
	discount=_discount;
	}
	public double getDiscount(){
	return discount;
	}
	
	public double getBill(){
		return super.getBill()-getDiscount();
		}
	
	public void announcement (){
		getClass();
	}

	public String toString(){
	return (super.toString()+""+getDiscount());
	}

	public boolean equals(DiscountSale discountSale){
	return (super.equals(discountSale)&& discount==discountSale.discount);
	}
}