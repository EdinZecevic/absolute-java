package pizza;

public class Pizza {
	
	private String large;
	private String medium;
	private String small;
	private String size;
	private int cheese;
	private int pepperoni;
	private int ham;
	
	public Pizza() {
		size=null;
		cheese=0;
		pepperoni=0;
		ham=0;
	}
	public Pizza(String size) {
		this.size=size;
		cheese=0;
		pepperoni=0;
		ham=0;
	}
	public Pizza(String size,int cheese) {
		this.size=size;
		this.cheese=cheese;
		pepperoni=0;
		ham=0;
	}
	public Pizza(String size,int cheese,int pepperoni) {
		this.size=size;
		this.cheese=cheese;
		this.pepperoni=pepperoni;
		ham=0;
	}
	public Pizza(String size,int cheese,int pepperoni,int ham) {
		this.size=size;
		this.cheese=cheese;
		this.pepperoni=pepperoni;
		this.ham=ham;
	}


	public String setLargePizza(String large) {
		this.large=large;
		return large;
	}
	public String setMediumPizza(String medium) {
		this.medium=medium;
		return medium;
	}
	public String setSmallPizza(String small) {
		this.small=small;
		return small;
	}
	public String setSize(String size) {
		this.size=size;
		return size;
	}
	
	public String getLargePizza() {
		return large;
	}
	public String getMediumPizza() {
		return medium;
	}
	public String getSmallPizza() {
		return small;
	}
	public String getSize() {
		return size;
	}
	
	public int setCheese(int cheese) {
		this.cheese=cheese;
		return cheese;
	}
	public int setPepperoni(int pepperoni) {
		this.pepperoni=pepperoni;
		return pepperoni;
	}
	public int setHam(int ham) {
		this.ham=ham;
		return ham;
}

	public int getCheese() {
		return cheese;
	}
	public int getPepperoni() {
		return pepperoni;
	}
	public int getHam() {
		return ham;
}

	public double calcCost(String size,int cheese, int pepperoni,int ham) {
		if(size.equals("large")) {
			return 14+(cheese*2)+(pepperoni*2)+(ham*2);
		}
		else if(size.equals("medium")) {
			return 12+(cheese*2)+(pepperoni*2)+(ham*2);
		}
		else if(size.equals("small")) {
			return 10+(cheese*2)+(pepperoni*2)+(ham*2);
		}
		else
			return 0;
	}

	public String getDescription() {
		return (size+" with cheese= "+cheese+", pepperoni= "
	+pepperoni+", ham= "+ham+", and it cost= "+this.calcCost(size,cheese, pepperoni, ham)+" $");
	}
}
