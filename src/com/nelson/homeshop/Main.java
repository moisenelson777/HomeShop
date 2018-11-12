package com.nelson.homeshop;

import com.nelson.paris.Bus;
import com.nelson.paris.MoyenDeLocomotion;
import com.nelson.paris.Parisien;
import com.nelson.paris.Taxi;

public class Main {

	public static void main(String[] args) {
		
		/* Product cafe = new Product("Philips HD76/61", "Philips SENSEO Quadrante, noir - 1 ou 2 tasses", 79.99);
		Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49", 599, 49, "LED");
		Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigerateur BEKO 130L - Classe A+ - blanc", 189, 130, false);
		
		Customer customer = new Customer("Moise Nelson", "29 rue saint Charles, Schiltigheim");
		
		Bill bill = new Bill(customer);
		bill.addProduct(cafe, 1);
		bill.addProduct(tv, 1);
		bill.addProduct(fridge, 1); */
		
	    Parisien segolene = new Parisien();
	    
	    Bus bus = new Bus();
	    segolene.seDeplacer(bus);
	    Taxi taxi = new Taxi();
	    segolene.seDeplacer(taxi);
	    MoyenDeLocomotion taxi2 = new Taxi();
	    segolene.seDeplacer(taxi2);
		
	}
}
