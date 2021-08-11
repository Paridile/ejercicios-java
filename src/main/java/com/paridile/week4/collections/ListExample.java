package com.paridile.week4.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("-------------------------");
		list.remove("a");
		for (String s : list) {
			System.out.println(s);
		}		
		System.out.println("-------------------------");
		System.out.println("Size: " + list.size());
		System.out.println("-------------------------");
		list.clear();
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("-------------------------");
		System.out.println("Size: " + list.size());
		System.out.println("-------------------------");
		list.add("a");
		list.add("b");
		list.add("c");
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("d");
		arrayList.add("e");
		arrayList.add("f");
		arrayList.add("e");
		list.addAll(arrayList);
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("-------------------------");
		System.out.println(list.contains("e"));
		System.out.println("-------------------------");
		System.out.println(list.indexOf("e"));
		System.out.println("-------------------------");
		System.out.println(list.lastIndexOf("e"));
		System.out.println("-------------------------");
		System.out.println(list.subList(1, 3));
		System.out.println("-------------------------");
		list.remove("e");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("-------------------------");
		list.removeAll(arrayList);
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("-------------------------");
		list.add("a");
		list.add("f");
		list.retainAll(arrayList);
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("-------------------------");

		
	}
}
