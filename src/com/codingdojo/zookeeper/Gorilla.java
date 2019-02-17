package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Threw some poop");
		energyLevel -=5;
	}
	public void eatBananas() {
		System.out.println("Just ate a banana");
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("Just climbed a tree");
		energyLevel -= 10;
	}
}
