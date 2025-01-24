package com.itp.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.itp.config.MyApplicationContext;
import com.itp.model.Car;

public class DriverAppPureJavaBeans {
public static void main(String[] args) {
	
	ApplicationContext beanFactory = new AnnotationConfigApplicationContext(MyApplicationContext.class);
	
	//Engine engine1=(Engine)beanFactory.getBean("engineByCDI");
//	Engine engine1=(Engine)beanFactory.getBean("apple");
//	System.out.println(engine1);
//	
//	Engine engine2=(Engine)beanFactory.getBean("mango");
//	System.out.println(engine2);
	
	Car car1=(Car)beanFactory.getBean("chicku");
	System.out.println(car1);
	
	AbstractApplicationContext abs=( AbstractApplicationContext)beanFactory;
	abs.registerShutdownHook();
}
}
