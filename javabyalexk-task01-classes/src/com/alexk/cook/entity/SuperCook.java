package com.alexk.cook.entity;

import java.util.List;

import com.alexk.cook.impl.Singing;

public class SuperCook extends Cook implements Singing {

	private int lvl;

	public SuperCook(int workExperience, String collegeName, List<String> workPlaces, int lvl, CookHat cookHat) {
		super(workExperience, collegeName, workPlaces, cookHat);
		this.lvl = lvl;
	}

	public void cookAPie() {
		System.out.println("I cook tiramisu.");
	}

	public void cookAPie(int numberOfPieses) {
		System.out.println("I cook " + numberOfPieses + " tiramisu cakes.");
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	@Override
	public void singASong(String songName) {
		System.out.println("My secret ingredient is singing " + songName + ".");
	}

}
