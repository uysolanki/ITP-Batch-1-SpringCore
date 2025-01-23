package com.itp.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Player // implements InitializingBean,DisposableBean
{
	private int pno;
	private String pname;
	private int mp;
	private int rs;
	
	public Player() {}
	public Player(int pno, String pname, int mp, int rs) {
		System.out.println("Para Constructor Called");
		this.pno = pno;
		this.pname = pname;
		this.mp = mp;
		this.rs = rs;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getRs() {
		return rs;
	}
	public void setRs(int rs) {
		this.rs = rs;
	}
	@Override
	public String toString() {
		return "Player [pno=" + pno + ", pname=" + pname + ", mp=" + mp + ", rs=" + rs + "]";
	}
	
	/*
	@Override
	public void destroy() throws Exception {
		System.out.println("Immediately Befrore Object Destruction");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Immediately After Constructor");
	}
	*/
	
	@PreDestroy
	public void xyz() {
		System.out.println("Immediately Befrore Object Destruction");
	}
	
	@PostConstruct
	public void abc() {
		System.out.println("Immediately After Constructor");
	}

}
