package com.ust;

public class SuperEngine extends Engine {
int booster;
	
	public SuperEngine(int power, int booster) {
		super(power);
		this.booster = booster;
	}

	@Override
	public String toString() {
		return "SuperEngine [booster=" + booster + ", power=" + power + "]";
	}

}
