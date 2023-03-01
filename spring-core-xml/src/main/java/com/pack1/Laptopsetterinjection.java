package com.pack1;

public class Laptopsetterinjection {
	
	String name;

	public void setName(String name) {
		this.name = name;
	}

	public void lsi() {
		
		System.out.println("Laptop name is "+name +".");
		System.out.println("I am Laptopsetterinjection!");
	}
	
}
