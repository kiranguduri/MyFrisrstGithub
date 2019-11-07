package com.ust;

public class RegularEngine extends Engine{

	public RegularEngine(int power) {
		super(power);
	}
	

	@Override
	public String toString() {
		return "RegularEngine [power=" + power + "]";
	}
}
