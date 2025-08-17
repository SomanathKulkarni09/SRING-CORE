package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.ComponentScanner;
import com.entity.Country;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanner.class);// write the name of
																									// ComponentScanner
																									// annotation file
			
		Country c= context.getBean(Country.class);
		
		System.out.println(c);
		

	}

}
