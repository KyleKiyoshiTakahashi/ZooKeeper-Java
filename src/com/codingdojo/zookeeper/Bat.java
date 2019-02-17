package com.codingdojo.zookeeper;

public class Bat extends Mammal{
	public void fly() {
		System.out.println("Bat is flying");
		super.batEnergy();
		energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("Eating a human");
		super.batEnergy();
		energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("Attacking a town");
		super.batEnergy();
		energyLevel -= 100;
	}
}
