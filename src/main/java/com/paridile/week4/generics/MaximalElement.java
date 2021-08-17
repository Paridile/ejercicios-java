package com.paridile.week4.generics;

import java.util.*;

// Write a generic method to find the maximal element in the range [begin, end) of a list.

public final class MaximalElement {
	
	public static <T extends Comparable<T>> T getMaximalElement(List<T> list, int begin, int end) {		
		T max = list.get(begin);
		for (int i = ++begin; i < end ; i++) {
			if (list.get(i).compareTo(max) > 0) {
				max = list.get(i);
			}
		}
		return max;
	}


	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,2,3,6,2,10,3,5,11,4,7,10,4);
		System.out.println("Maximum element in list: " + getMaximalElement(list, 0, list.size()));

	}
}