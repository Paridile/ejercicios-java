package com.paridile.week3.strings;

// Write a program that computes your initials from your full name and displays them.

public class Initials {
	public static void main(String[] args) {		
		String name = "Nombre de ejemplo";
		System.out.println(initials(name));
	}

	public static String initials(String name) {
		String[] words = name.trim().split("\\s+");
		StringBuilder initials = new StringBuilder();
		for (String word : words) {
			initials.append(word.charAt(0));
		}
		return initials.toString().toUpperCase();
	}
}
