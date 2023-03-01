package com.pack2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Laptop {
	
	Pendrive drive;
	
	public Laptop(Pendrive drive) {
		super();
		this.drive = drive;
	}
	
	public void lap1() {
		
		System.out.println("pen drive connect");
		drive.pen1();
	}
	

	
	
	
	
}
