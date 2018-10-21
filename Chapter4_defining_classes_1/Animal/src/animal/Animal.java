package animal;

public class Animal {
	
	private String name;
	private String population;
	private int growthRate;
	
	public Animal() {
		name="Name";
		population="population";
		growthRate=0;
	}
	
	public Animal(String name) {
		setName(name);
	}
	public Animal(String name,String population) {
		setName(name);
		setPopulation(population);
	}
	public Animal(String name,String population,  int growthRate) {
		setAll(name, population, growthRate);
	}
	
	
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setPopulation(String population){
		this.population=population;
	}
	
	public void setGrowthRate(int growthRate){
		this.growthRate=growthRate;
	}
	
	public void setAll(String name, String population, int growthRate) {
		this.name=name;
		this.population=population;
		this.growthRate=growthRate;
	}
	
	public boolean equals(Animal x, Animal y) {
		if(x.equals(y))
			return true;
		else
			return false;
	}
	
	public boolean endangered(int growthRate) {
		if(growthRate<0)
			return true;
		else 
			return false;
	}

	public String toSting() {
		return(name+", "+population+", "+growthRate);
	}
}
