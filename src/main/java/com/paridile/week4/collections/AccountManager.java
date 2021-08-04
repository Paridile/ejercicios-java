package com.paridile.week4.collections;

import java.util.HashMap;
import java.util.Map;

public class AccountManager {

	// private Map accountTotals = new HashMap();
	private Map<String, Integer> accountTotals = new HashMap<String, Integer>();
	private int retirementFund;
	public static void main(String[] args) {
		AccountManager accountManager = new AccountManager();
		accountManager.setBalance("Ejemplo", 123);
		accountManager.setBalance("Ejemplo2", 1234);		
		System.out.println(accountManager.getBalance("Ejemplo"));

		System.out.println();

		for (Integer i : accountManager.accountTotals.values()) {
			System.out.println(i);
		}		

	}

	public int getBalance(String accountName) {
		// Integer total = (Integer) accountTotals.get(accountName);
		// if (total == null)
		// 	total = Integer.valueOf(0);
		// return total.intValue();
		Integer total = accountTotals.get(accountName);
		if (total == null)
			total = 0;
		return total;
	}

	public void setBalance(String accountName, int amount) {
		// accountTotals.put(accountName, Integer.valueOf(amount));
		accountTotals.put(accountName, amount);
	}
}
