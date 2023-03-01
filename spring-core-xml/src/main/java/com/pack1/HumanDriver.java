package com.pack1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HumanDriver {

	public static void main(String[] args) {
		
		Human human=new Human();
		
		human.m1();
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		Resource resource=new ClassPathResource("file1.xml");
		
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		
		Human l1=(Human) beanFactory.getBean("gani");
		
		l1.m1();
		
	}

}
