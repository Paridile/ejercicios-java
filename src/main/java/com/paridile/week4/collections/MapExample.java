package com.paridile.week4.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map <Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("-------------------");
		map.keySet().forEach(System.out::println);
		System.out.println("-------------------");
		map.entrySet().forEach(System.out::println);
		System.out.println("-------------------");
		map.values().forEach(System.out::println);
		System.out.println("-------------------");
		map.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));		
		System.out.println("-------------------");		
		System.out.println(map.get(2));
		map.remove(2);		
		System.out.println("-------------------");
		System.out.println(map.get(2));
		System.out.println("-------------------");
		System.out.println("Size: " + map.size());
		System.out.println("-------------------");
		System.out.println("Is empty: " + map.isEmpty());
		System.out.println("-------------------");
		System.out.println("Contains: " + map.containsKey(1));
		System.out.println("-------------------");
		System.out.println("Contains: " + map.containsValue("One"));
		System.out.println("-------------------");
		map.compute(1, (k, v) -> v+"1");
		map.values().forEach(System.out::println);
		System.out.println("-------------------");
		map.computeIfAbsent(1, k -> "One");
		map.computeIfAbsent(4, k -> "Four");
		map.values().forEach(System.out::println);
		System.out.println("-------------------");		
	}
}
