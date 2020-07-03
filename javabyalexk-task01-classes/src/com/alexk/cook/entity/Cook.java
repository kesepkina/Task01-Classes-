package com.alexk.cook.entity;

import java.util.List;

public class Cook {
	
	private int workExperience;
	private String collegeName;
	private List<String> workPlaces;
	private CookHat cookHat;
	
	public Cook(int workExperience, String collegeName, List<String> workPlaces, CookHat cookHat) {
		super();
		this.workExperience = workExperience;
		this.collegeName = collegeName;
		this.workPlaces = workPlaces;
		this.cookHat = cookHat;
	}

	public Cook(int workExperience, List<String> workPlaces) {
		super();
		this.workExperience = workExperience;
		this.workPlaces = workPlaces;
	}

	public void cookAPie() {
		System.out.println("I cook cookieeees.");
	}

	public int getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public List<String> getWorkPlaces() {
		return workPlaces;
	}

	public void setWorkPlaces(List<String> workPlaces) {
		this.workPlaces = workPlaces;
	}

	public CookHat getCookHat() {
		return cookHat;
	}

	public void setCookHat(CookHat cookHat) {
		this.cookHat = cookHat;
	}

}
