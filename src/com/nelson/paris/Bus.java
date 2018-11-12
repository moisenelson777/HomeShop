package com.nelson.paris;

public class Bus implements MoyenDeLocomotion {

	@Override
	public void deplace(String adresse) {
		System.out.println("Je suis un bus et je vais à l'adresse : "+adresse);

	}

}
