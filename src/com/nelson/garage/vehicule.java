package com.nelson.garage;

public abstract class vehicule {

	private String description;
	private String manufacturer;
	protected String  modelName;
	private String color;
	private int speed, year, weight;
	private int [] dimensions;
	
	public vehicule(String modelName, String description, String manufacturer, int year, String color, int speed,     
			 int[] dimensions, int weight) {
		
		this.modelName = modelName;
		this.description = description;
		this.manufacturer = manufacturer;
		this.year = year;
		this.color = color;
		this.speed = speed;
		this.dimensions = dimensions;
		this.weight = weight;
		
	}
	
	public abstract void start();
	
	public abstract void stop();

	public String getDescription() {
		return description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModelName() {
		return modelName;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}

	public int getYear() {
		return year;
	}

	public int getWeight() {
		return weight;
	}

	public int[] getDimensions() {
		return dimensions;
	}
	
}
