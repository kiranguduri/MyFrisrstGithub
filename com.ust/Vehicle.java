package com.ust;

abstract class Vehicle implements Comparable<Vehicle> {
	int speed;
	Engine engine;
	
	
	
	
	public Vehicle(int speed, Engine engine) {
		super();
		this.speed = speed;
		this.engine = engine;
	}




	public abstract void start();
	
	
	
}
