package com.paridile.week4.generics;

// Write a generic method to exchange the positions of two different elements in an array.

public class ExchangeArray {
	
	public static <T> void exchange(T[] array, int index1, int index2) {
		T temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	public static void main(String[] args) {
		Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		exchange(array, 2, 4);
		for (Integer i : array) {
			System.out.print(i + " ");
		}
	}
}
