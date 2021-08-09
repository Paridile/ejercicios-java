package com.paridile.week3.strings;

// Write a program that computes your initials from your full name and displays them.

public class Initials {
	public static void main(String[] args) {		
		String name = "Nombre de ejemplo";
		System.out.println(initials(name));
	}

	public static String initials(String name) {
		StringBuilder initials = new StringBuilder();
		if (name != null && !name.trim().isEmpty()) {
			String[] words = name.trim().split("\\s+");
			for (String word : words) {
				initials.append(word.charAt(0));
			}
		}else {
			return "";
		}
		return initials.toString().toUpperCase();
	}
}
