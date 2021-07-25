package com.paridile.objectoriented;

class Solution {
	public static void main(String[] args) {
		// int[] i = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// Solution solution = new Solution();
		// for (int j : solution.twoSum(i, 5)) {
		// System.out.println(j);
		// }
	}

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return result;
	}

	public boolean isPalindrome(int x) {
		StringBuilder sb = new StringBuilder();
		sb.append(Integer.toString(x));
		String reversed = sb.reverse().toString();
		return reversed.equals(Integer.toString(x));
	}

}