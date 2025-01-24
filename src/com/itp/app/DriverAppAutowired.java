package com.itp.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Car;

public class DriverAppAutowired {
public static void main(String[] args) {
	
	ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
	System.out.println("hi");
	
	Car car1=(Car)beanFactory.getBean("c2");
	
	System.out.println(car1);
	AbstractApplicationContext abs=( AbstractApplicationContext)beanFactory;
	abs.registerShutdownHook();
}
}
