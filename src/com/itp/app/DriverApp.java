package com.itp.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Car;
import com.itp.model.Engine;
import com.itp.model.Gear;

public class DriverApp {

	public static void main(String[] args) {
		Engine eng1=new Engine(1500, 15, "Petrol", "Bajaj");
//		
//		Engine eng2=new Engine(2500, 25, "Diesel", "Tata");
//		
		Gear gear1=new Gear(6, 2024, "black", "Honda");
//		Gear gear2=new Gear(8, 2023, "red", "Volvo");
//		
		Car car1=new Car(2024, "Grey", "Thar", "Mahindra", eng1, gear1);
//		Car car2=new Car();
//		car2.setCarColor("Red");
//		car2.setCarMfgName("Audi");
//		car2.setCarModelName("Q3");
//		car2.setCarModelYear(2022);
//		car2.setEngine(eng2);
//		car2.setGear(gear2);
//		
//		System.out.println(car1);
//		System.out.println(car2);

		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
//		Engine eng11=beanFactory.getBean("e1",Engine.class);
//		System.out.println(eng11);
////		System.out.println(eng1);
//		
//		Engine eng21=beanFactory.getBean("e2",Engine.class);
//		System.out.println(eng21);
////		System.out.println(eng2);
//		System.out.println(eng21);
		
		Car car11=beanFactory.getBean("c1",Car.class);
		System.out.println(car1);
		System.out.println(car11);
		
		AbstractApplicationContext abs=( AbstractApplicationContext)beanFactory;
		abs.registerShutdownHook();

	}
}
