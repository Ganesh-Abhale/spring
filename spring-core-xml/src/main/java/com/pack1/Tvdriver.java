package com.pack1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tvdriver {

	public static void main(String[] args) {
		
		
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("file3.xml");
		
		 Tv t1=(Tv) context.getBean("tv");
		 
		 t1.tv1();
		 t1.tv2();

	}

}
