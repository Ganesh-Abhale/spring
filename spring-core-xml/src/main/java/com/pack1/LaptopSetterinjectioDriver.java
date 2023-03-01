package com.pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopSetterinjectioDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("file2.xml");
		
		Laptopsetterinjection lap=(Laptopsetterinjection) context.getBean("lapi");
		
		lap.lsi();

	}

}
