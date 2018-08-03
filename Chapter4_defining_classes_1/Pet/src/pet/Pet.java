package pet;

public class Pet {
	private String animal;
	private String dog="dog";
	private String cat="cat";
	private double weight;
	public Pet() {
		animal="animal";
	}
	
	public Pet(String animal) {
		setAnimal(animal);
	}
	public Pet(double weight) {
		setWeight(weight);
	}
	
	public Pet(String animal,double weight) {
		this.animal=animal;
		this.weight=weight;
		if(animal.equals(this.dog)) {
			System.out.println("Dosage of acepromazine For Dog is: "+this.acepromazineForDog(weight));
			System.out.println("Dosage of carprofen For Dog is: "+this.carprofenForDog(weight));
		}
		else if(animal.equals(this.cat)) {
			System.out.println("Dosage of acepromazine For cat is: "+this.acepromazineForCat(weight));
			System.out.println("Dosage of carprofen For cat is: "+this.carprofenForCat(weight));
		}
		else
			System.out.println("error");
	}
	
	public void setBooth(String animal,double weight) {
		this.animal=animal;
		this.weight=weight;
	}
	
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public double getWeight() {
		return this.weight;
	}
	
	
	public void setAnimal(String animal) {
		this.animal=animal;
	}
	
	public String toString() {
		return (animal+", "+weight+", "+this.acepromazineForCat(weight));
	}
	
	public double acepromazineForDog(double weight) {
		this.weight=weight;
		double acepromazineForDog=(weight/2.2)*(10/0.03);
		return acepromazineForDog;
	}
	
	public double acepromazineForCat(double weight) {
		this.weight=weight;
		double acepromazineForCat=(weight/2.2)*(10/0.002);
		return acepromazineForCat;
	}
	
	public double carprofenForDog(double weight) {
		this.weight=weight;
		double carprofenForDog=(weight/2.2)*(12/0.5);
		return carprofenForDog;
	}
	
	public double carprofenForCat(double weight) {
		this.weight=weight;
		double carprofenForCat=(weight/2.2)*(12/0.25);
		return carprofenForCat;
	}
}
