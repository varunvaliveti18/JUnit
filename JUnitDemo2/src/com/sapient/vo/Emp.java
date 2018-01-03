package com.sapient.vo;

public class Emp {
	
	private int empId;
	private String empName;
	private double sal;
	public Emp(int empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getSal() {
		return sal;
	}
	@Override
	public boolean equals(Object obj) {
		Emp emp =(Emp) obj;
		if(this.empId == emp.empId && this.empName.equals(empName) && this.sal == emp.sal)
			return true;
		else 
			return false;
	}
	
	

}
