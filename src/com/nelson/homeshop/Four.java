package com.nelson.homeshop;

public class Four {

	private Resistance resistance;
	private Soufflerie soufflerie;
	
	 public void cuire(int temperature, int duree) {
	        if (temperature < 40 || temperature > 250)
	            throw new IllegalArgumentException("La température du four doit être comprise en 40 et 250 degrés");
	        if (duree <= 0)
	            throw new IllegalArgumentException("La durée doit être positive");
	        System.out.println("Je cuis un plat à " + temperature + " degrés, pendant " + duree + " minutes.");
	    }

	public Resistance getResistance() {
		return resistance;
	}

	public void setResistance(Resistance resistance) {
		this.resistance = resistance;
	}

	public Soufflerie getSoufflerie() {
		return soufflerie;
	}

	public void setSoufflerie(Soufflerie soufflerie) {
		this.soufflerie = soufflerie;
	}

	
	
}
