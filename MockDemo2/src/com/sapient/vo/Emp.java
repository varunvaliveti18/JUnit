package com.sapient.vo;

public class Emp {

	private int eid;
	private String ename;
	private double sal;
	public Emp(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public double getSal() {
		return sal;
	}
	@Override
	public boolean equals(Object obj) {
		Emp emp = (Emp) obj;
		if(this.eid == emp.eid && this.ename.equals(emp.ename) && this.sal == emp.sal)
			return true;
		else
		return false;
	}
	
	
}
