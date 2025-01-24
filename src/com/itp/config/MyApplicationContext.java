package com.itp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.itp.model.Car;
import com.itp.model.Engine;
import com.itp.model.Gear;

@Configuration
@ComponentScan(basePackages="com.itp.model")
public class MyApplicationContext {

	@Bean(name="apple")
	public Engine engineByCDI()
	{
		return new Engine(3500,35,"Electric","Tesla");
	}
	
	
	@Bean(name="mango")
	public Engine engineBySDI()
	{
		Engine e1=new Engine();
		e1.setEngineHP(5000);
		e1.setEngineLitre(50);
		e1.setEngineMfgName("Volvo");
		e1.setEngineType("Hybrid");
		return e1;
	}
	
	@Bean(name="banana")
	public Gear gearByCDI()
	{
		return new Gear(6,26,"Red","Hero");
	}
	
	@Bean(name="chicku")
	public Car carByAutowired()
	{
		return new Car(2021,"Grey","Innova","Toyota");
	}
}
