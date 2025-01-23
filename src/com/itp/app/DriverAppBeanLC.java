package com.itp.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Player;

public class DriverAppBeanLC {
public static void main(String[] args) {
	
	ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
	System.out.println("hi");
	
	Player player1=(Player)beanFactory.getBean("p1");
	
	System.out.println(player1);
	AbstractApplicationContext abs=( AbstractApplicationContext)beanFactory;
	abs.registerShutdownHook();
}
}