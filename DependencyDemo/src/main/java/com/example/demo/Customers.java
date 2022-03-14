package com.example.demo;

public class Customers {
	private int cusid;
	private String cusname;
	private String coursename; 
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		cusname = cusname;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	public void display()
	{
		System.out.println("customers object returned succesfully");
	}

}
