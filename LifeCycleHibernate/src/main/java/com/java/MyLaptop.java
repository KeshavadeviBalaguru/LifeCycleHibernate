package com.java;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyLaptop {
	@Id
	private int lid;
	private String lname;
	private float lprice;
	//getter and setter method
	public int getLid() {
		return lid;
	}
	
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public float getLprice() {
		return lprice;
	}
	public void setLprice(float lprice) {
		this.lprice = lprice;
	}
	@Override
	public String toString() {
		return "MyLaptop [lid=" + lid + ", lname=" + lname + ", lprice=" + lprice + "]";
	}


}
