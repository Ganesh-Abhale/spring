package com.pack2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Laptopdriver {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("file4.xml");
		
		 Laptop l1=(Laptop)context.getBean("lapi");
		 
		 l1.lap1();
		 
		

	}

}
