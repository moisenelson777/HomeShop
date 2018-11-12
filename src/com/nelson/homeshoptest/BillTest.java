package com.nelson.homeshoptest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.nelson.homeshop.Bill;
import com.nelson.homeshop.Customer;
import com.nelson.homeshop.Delivery;
import com.nelson.homeshop.Fridge;
import com.nelson.homeshop.Product;
import com.nelson.homeshop.RelayDelivery;
import com.nelson.homeshop.Television;
import com.nelson.homeshop.Writer;

class BillTest {

	private String output;
	private Writer writerMock = new Writer() {
		
		@Override
		public void start() {
			output = "";
		}
		
		@Override
		public void writeLine(String line) {
			output += line + "%n";
		}
		
		@Override
		public void stop() {
			
		}
	};

	 private Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
	    private Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurv�e 49\"", 599, 49, "LED");
	    private Fridge fridge = new Fridge("BEKO TSE 1042 F", "R�frig�rateur BEKO 130L - Classe A+ - blanc", 189, 130, false);
	    private Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");
	    private Delivery lowCostRelayDelivery = new RelayDelivery(27);

	    @Test
	    public void Given_2productsAndDelivery_When_generatingBill_Then_getGoodLineNumber() {
	        Bill bill = new Bill(customer, lowCostRelayDelivery);
	        bill.addProduct(cafe, 1);
	        bill.addProduct(tv, 1);
	        bill.generate(writerMock);
	        int lineNumber = output.split("\n").length;
	        assertEquals(20, lineNumber);
	    }

	    @Test
	    public void Given_3productsAndDelivery_When_generatingBill_Then_getGoodTotal() {
	        Bill bill = new Bill(customer, lowCostRelayDelivery);
	        bill.addProduct(cafe, 1);
	        bill.addProduct(tv, 1);
	        bill.addProduct(fridge, 1);
	        assertEquals(870.98, bill.getTotal(), 0.01);
	    }
	}
