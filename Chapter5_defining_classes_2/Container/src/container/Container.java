package container;

public class Container {

	private int capacity;
	private double quantity;
	@SuppressWarnings("unused")
	private double mililiters;
	private double Kiloliters;
	
	public Container() {
		capacity=0;
		quantity=0;
	}
	public Container(int capacity) {
		setCapacity(capacity);
	}
	public Container(int capacity,int quantity) {
		setBooth(capacity,quantity);
	}
	
	public void setBooth(int capacity,int quantity) {
		this.quantity=quantity;	
		this.capacity=capacity;	
	}
	public void setCapacity(int capacity) {
		this.capacity=capacity;	
	}
	
	public String fillContainer(int quantity) {
			this.quantity=quantity;
			return (capacity+", "+this.quantity);
}
	public int emptyContainer() {
			this.capacity=0;
			return 	this.capacity;
}

	public String toString() {
		return(capacity+", "+quantity);
	}

	public double getQuantitiy() {
		return quantity;
	}
	public int getCapacity() {
		return capacity;
	}
	
	public double LeftOver() {
		return this.getCapacity()-this.getQuantitiy();
	}
	public int FullFiled(int capacity) {
		this.capacity=capacity;
		return capacity;
	}
	
	public double getQuantitiyLiters(int quantity) {
		this.quantity=quantity;
		return this.quantity;
	}
	public double getQuantitiyMililiters(int quantity) {
		this.quantity=quantity;
		return this.quantity*1000;	
	}
	public double getQuantitiyKiloliters(double quantity) {
		this.quantity=quantity;
		Kiloliters=this.quantity/1000;
		return Kiloliters;	
	}
}
