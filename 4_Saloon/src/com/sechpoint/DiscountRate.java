package com.sechpoint;

public class DiscountRate {
	static double serviceDiscountPremium = 0.2;
	static double serviceDiscountGold = 0.15;
	static double serviceDiscountSilver = 0.1;
	double productDiscountPremium = 0.1;
	double productDiscountGold = 0.1;
	double productDiscountSilver = 0.1;
	
	public static double getServiceDiscountRate(Visit visit, String type) {
		if (type == "Premium") {
			return visit.getServiceExpense() * (1 - serviceDiscountPremium);
		}
		else if (type == "Gold"){
			return visit.getServiceExpense() * (1 - serviceDiscountGold);
		}
		else {
			return visit.getServiceExpense() * (1 - serviceDiscountSilver);
		}
	}
	
	public static double getProductDiscountRate(Visit visit, String type) {
		return 0.9 * visit.getProductExpense();
	}
}
