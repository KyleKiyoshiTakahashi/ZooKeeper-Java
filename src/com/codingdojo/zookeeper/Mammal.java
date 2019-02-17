package com.codingdojo.zookeeper;

public class Mammal {
	Integer energyLevel = 100;
	public int displayEnergy() {
		System.out.println("This is the energy level: "+ energyLevel);
		return energyLevel;
	}
	public void batEnergy() {
		energyLevel = 300;
		
	}
}
