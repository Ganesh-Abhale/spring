 package com.pack1;

public class Tv {
	
	int id;
	String name;
	Double price;
	public Tv(int id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void tv1()
	{
		System.out.println("From Tv!");
	}

	public void tv2()
	{
		System.out.println("Tv id is "+id);
		System.out.println("Tv name is "+name);
		System.out.println("Tv price is "+price);
	}

}
