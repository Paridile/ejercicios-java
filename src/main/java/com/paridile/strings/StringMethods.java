package com.paridile.strings;

import java.util.HashMap;
import java.util.Map;

public class StringMethods {
	public static void main(String... args) {
		String string = "Esto es un ejemplo";
		getVocalsAndConsonants(string);
	}

	public static void getVocalsAndConsonants(String string) {
		String witoutSpaces = string.toUpperCase().replaceAll(" ", "");
		String[] arrStr = witoutSpaces.split("");
		Integer totalVocals = 0, totalConsonants = 0;
		Map<String, Integer> mapVocals = new HashMap<String, Integer>();
		Map<String, Integer> mapConsonants = new HashMap<String, Integer>();
		for (String caracter : arrStr) {
			if (caracter.equals("A") || caracter.equals("E") || caracter.equals("I") || caracter.equals("O")
					|| caracter.equals("U")) {
				if (mapVocals.containsKey(caracter)) {
					mapVocals.put(caracter, mapVocals.get(caracter) + 1);
				} else {
					mapVocals.put(caracter, 1);
				}
			} else {
				if (mapConsonants.containsKey(caracter)) {
					mapConsonants.put(caracter, mapConsonants.get(caracter) + 1);
				} else {
					mapConsonants.put(caracter, 1);
				}
			}
		}

		for (Integer i : mapVocals.values()) {
			totalVocals += i;
		}
		for (Integer i : mapConsonants.values()) {
			totalConsonants += i;
		}
		System.out.println("Unique vocals used: " + mapVocals.size());
		System.out.println("Total vocals used " + totalVocals + "\n");
		System.out.println(mapVocals + "\n");
		System.out.println("Unique consonants used: " + mapConsonants.size());
		System.out.println("Total consonants used " + totalConsonants + "\n");
		System.out.println(mapConsonants);
	}

}
