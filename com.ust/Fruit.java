package com.ust;


public class Fruit {

	String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Fruit f = (Fruit) obj;
		return this.name.equals(f.name);
	}

}
