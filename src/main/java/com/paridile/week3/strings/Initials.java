package com.paridile.week3.strings;

// Write a program that computes your initials from your full name and displays them.

public class Initials {
	public static void main(String[] args) {		
		String name = "Nombre de ejemplo";
		System.out.println(initials(name));
	}

	public static String initials(String name) {
		String[] words = name.trim().split(" ");		
		String initials = "";
		for (int i = 0; i < words.length; i++) {
			initials += words[i].toUpperCase().charAt(0);
		}
		return initials;
	}
}
