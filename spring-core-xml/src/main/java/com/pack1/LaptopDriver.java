package com.pack1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class LaptopDriver {

	public static void main(String[] args) {
		
		
		Resource resource=new ClassPathResource("file1.xml");
		
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Laptop l1=(Laptop)beanFactory.getBean("lapi");
		System.out.println(l1);
		
		
		Laptop l2=(Laptop)beanFactory.getBean("lapi");
		System.out.println(l2);
		 
		Laptop l3=(Laptop)beanFactory.getBean("lapi");
		System.out.println(l3);
		 
		
		//l1.lap1();
		
		
		
		
	}

}
