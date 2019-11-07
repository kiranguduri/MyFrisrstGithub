package com.ust;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("ssdgsdg");
		list.add("second value");
//		list.add(23);

		for (String str : list) {
//			String str = (String) obj;
			System.out.println(str.subSequence(0, 2));
//			System.out.println(obj);
		}

		System.out.println(list);
	}

}
