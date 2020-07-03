package com.alexk.cook.entity;

public abstract class Headdress {

	private String colour;
	private String material;
	private int monthsOfExploitation;

	public Headdress(String colour, String material, int monthsOfExploitation) {
		super();
		this.colour = colour;
		this.material = material;
		this.monthsOfExploitation = monthsOfExploitation;
	}

	public void addAMonth() {
		monthsOfExploitation++;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getMonthsOfExploitation() {
		return monthsOfExploitation;
	}

	public void setMonthsOfExploitation(int monthsOfExploitation) {
		this.monthsOfExploitation = monthsOfExploitation;
	}

}
