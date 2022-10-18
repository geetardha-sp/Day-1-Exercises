package com.sechpoint;

public class Main {
	public static void main(String[] args) {
		Time time_1 = new Time(10, 07, 01);
		
		System.out.println(time_1);
		
		System.out.println(time_1.nextSecond().nextSecond());
	}
}
