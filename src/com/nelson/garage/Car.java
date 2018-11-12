package com.nelson.garage;

import java.util.ArrayList;
import java.util.List;

public class Car extends vehicule {
	
	private int door;
    private int literPer100km;
    private String motor;
    private List<String> options = new ArrayList<String>();

    public Car(String modelName, String description, String manufacturer, int yeah, String color, int speed, int[] dimensions, int weight, int door, int literPer100km, String motor, List<String> options) {
        super(modelName, description, manufacturer, yeah, color, speed, dimensions, weight);
        this.door = door;
        this.literPer100km = literPer100km;
        this.motor = motor;
        this.options = options;
    }

    @Override
    public void start() {
    	System.out.println("Je suis "+modelName+" je consomme "+literPer100km+" au 100km et je demmare");
    }
    
    @Override
    public void stop() {
    	System.out.println("Je suis "+modelName+" j'arrete mon moteur "+ motor);
    }
    public void startHeadlight() {
        System.out.println("J'allume mes phares");
    }

    public void openTrunk() {
        System.out.println("J'ouvre mon coffre");
    }

	public int getDoor() {
		return door;
	}

	public int getLiterPer100km() {
		return literPer100km;
	}

	public String getMotor() {
		return motor;
	}

	public List<String> getOptions() {
		return options;
	}

    
}

