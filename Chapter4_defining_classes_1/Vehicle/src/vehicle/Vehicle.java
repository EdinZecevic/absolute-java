package vehicle;

import java.util.Scanner;

public class Vehicle {
	int tankSize=100;
	int fuelInTank=0;
	int tankEficiency=fuelInTank*10;
	
	Scanner keyboard= new Scanner(System.in);
	
	public int getTankSize() {
		return tankSize;
	}
	public int getTankEficiency() {
		return tankEficiency;
	}
	public int getFuelInTank() {
		return fuelInTank;
	}
	
	public int addPetrol(int addPetrol) {
		System.out.println("You have: " +fuelInTank+ " you can add "+ (this.tankSize-fuelInTank) );
		addPetrol=keyboard.nextInt();
		this.fuelInTank=this.fuelInTank+addPetrol;;
		if(addPetrol<=this.fuelInTank) {
			System.out.println("You add: " +addPetrol+ " of petrol! Good luck!");
		}
		else
			System.out.println("It is too much of fuel!");
		return 0;
	}
	
	public int driveTo() {
		int totalEficiency;
		totalEficiency=this.getFuelInTank()*10;
		System.out.println("You can drive: " +totalEficiency+ " km");
		return 0;
	}
}
