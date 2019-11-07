package com.ust;

public class Engine {
int power;
	
	
	
	public Engine(int power) {
		super();
		this.power = power;
	}



	public void start(){
		System.out.println("Starting engine..." + power + "-cc");
	}



	@Override
	public String toString() {
		return "Engine [power=" + power + "]";
	}
	
	
	
}
