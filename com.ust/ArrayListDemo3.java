package com.ust;



import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		ArrayList<Fruit> fruits = new ArrayList<>();
		
		Fruit apple = new Fruit("Apple");
		Fruit orange = new Fruit("Orange");
		Fruit banana = new Fruit("Banana");
		Fruit pineApple = new Fruit("PineApple");
		Fruit kiwi = new Fruit("Kiwi");
		
		
		Fruit searchFruit = apple;
		System.out.println(apple.equals(searchFruit));
		
		fruits.add(apple);
		fruits.add(orange);
		fruits.add(banana);
		fruits.add(pineApple);
		fruits.add(kiwi);
		
		System.out.println(fruits);
		
		boolean result = fruits.contains(new Fruit("Banana"));
		System.out.println(result);
		

	}

}
