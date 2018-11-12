package com.nelson.homeshop;

public class Aliment {
	String nom;
	boolean estCuit;
	
	public void manger() {
		if(estCuit) {
			System.out.println("Miam miam cet aliment : " +nom+ " est bien cuit.");
		}else {
			System.out.println("Beeerk cet aliment est : " +nom+ " est cru.");
		}
	}
}
