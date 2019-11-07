package com.ust;

import java.util.ArrayList;

public class Fruits {
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Grape");
		list.add("Lemon");
		list.add("Mango");
		System.out.println(list);
		String gr="Grape";
		boolean b=list.contains(gr);
		System.out.println(b);
	}

}
