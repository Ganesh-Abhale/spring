package com.pack1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CarDriver {

	public static void main(String[] args) {
	
		
		Resource resource= new ClassPathResource("file1.xml");
		
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		
		Car c1=(Car) beanFactory.getBean("ganibhai");
		
	
		
		
		//c1.ca1();
		
		
		
	}

}
