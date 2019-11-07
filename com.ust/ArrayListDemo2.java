package com.ust;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("PineApple");
		fruits.add("Grape");
		
		System.out.println(fruits);
		String findStr = "Apple";
		
		System.out.println(fruits.contains(findStr));
		
		System.out.println(fruits.get(2));
		
		
		LinkedList<String> fruitsList = new LinkedList<>(fruits);
		fruitsList.remove(2);
		System.out.println(fruitsList);
		

	}

}
