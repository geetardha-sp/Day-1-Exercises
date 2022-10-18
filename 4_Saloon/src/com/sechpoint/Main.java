package com.sechpoint;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer("SechPoint");
		customer.setMemberType("Gold");
		
		Date date = new Date();
		Visit visit = new Visit(customer, date);
		visit.setServiceExpense(96700);
		visit.setProductExpense(32300);
		
		System.out.println(visit.getTotalExpense());
	}
}
