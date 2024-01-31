package com.om;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


public static void main(String[] args) {
	System.out.println("in main");
	ApplicationContext context=new ClassPathXmlApplicationContext("com/om/bean.xml");
	 Car car = context.getBean(Car.class);
	 
	 
	 car.drive();
}
}
