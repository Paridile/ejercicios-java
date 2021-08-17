package com.paridile.week4.collections;

import java.util.TreeSet;

public class TreeSize {
	public static void main(String[] args) {
		TreeSet<String> s = new TreeSet<String>();
		TreeSet<String> subs = new TreeSet<String>();
		s.add("a"); // s.size = 1
		s.add("b"); // s.size = 2
		s.add("c"); // s.size = 3
		s.add("d"); // s.size = 4
		s.add("e"); // s.size = 5

		subs = (TreeSet) s.subSet("b", true, "d", true); // subs.size = 3
		s.add("g"); // s.size = 6
		s.pollFirst(); // s.size = 5
		s.pollFirst(); // s.size = 4
		s.add("c2"); // s.size = 5		
		System.out.println(s.size() + " " + subs.size());
	}
}
