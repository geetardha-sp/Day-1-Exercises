package com.sechpoint;

public class Main {
	public static void main(String[] args) {
		Account account_1 = new Account("id1", "name1", 5000);
		Account account_2 = new Account("id2", "name2", 5000);
		
		account_1.transferTo(account_2, 3000);
		
		System.out.println("Account 1: " + account_1.getBalance());
		System.out.println("Account 2: " + account_2.getBalance());
		
		account_2.debit(3000);
		
		System.out.println("Account 1: " + account_1.getBalance());
		System.out.println("Account 2: " + account_2.getBalance());
	}
}
