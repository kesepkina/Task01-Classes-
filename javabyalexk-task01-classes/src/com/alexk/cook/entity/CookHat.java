package com.alexk.cook.entity;

public class CookHat extends Headdress {

	public CookHat(String colour, String material, int monthsOfExploitation) {
		super(colour, material, monthsOfExploitation);
	}

	public void state() {
		if (getMonthsOfExploitation() >= 5) {
			System.out.println("Throw me away!");
		}
		System.out.println("I'm still Ok.");
	}

}
