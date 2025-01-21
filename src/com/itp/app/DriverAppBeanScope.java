package com.itp.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Gear;

public class DriverAppBeanScope {
public static void main(String[] args) {
	
	ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
	System.out.println("hi");
	
	Gear gear1=(Gear)beanFactory.getBean("g1");
	Gear gear2=(Gear)beanFactory.getBean("g1");
	
	System.out.println(gear1==gear2);
	AbstractApplicationContext abs=( AbstractApplicationContext)beanFactory;
	abs.registerShutdownHook();
}
}
