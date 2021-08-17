package com.paridile.week4.generics;

import java.util.Arrays;
import java.util.Collection;

// Write a generic method to count the number of elements in a collection that have a specific property 
// (for example, odd integers, prime numbers, palindromes).

public class PropertyCount {

	public static <T extends Number> int countOdds(Collection<T> collection) {
		int total = 0;
		for (T element : collection) {
			if (element.doubleValue() % 2 == 1) {
				total++;
			}
		}
		return total;
	}

	public static <T extends Number> boolean isPrime(T number) {
		if (number.doubleValue() % 2 == 0) {
			return false;
		}
		for (int i = 3; i < number.doubleValue(); i += 2) {
			if (number.doubleValue() % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static <T extends Number> int countPrimes(Collection<T> collection) {
		int total = 0;
		for (T number : collection) {
			if (isPrime(number)) {
				total++;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		Collection<Integer> c = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Total odds: " + countOdds(c));
		System.out.println("------------------------");
		System.out.println("Total primes: " + countPrimes(c));
	}

}
