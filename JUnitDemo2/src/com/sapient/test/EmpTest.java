package com.sapient.test;
import static  org.junit.jupiter.api.Assertions.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.CalcService;
import com.sapient.service.EmpService;
import com.sapient.service.Factory;
import com.sapient.service.NotFoundException;
import com.sapient.service.Palindrome;
import com.sapient.vo.Emp;

import static org.junit.jupiter.api.Assumptions.*;

import java.sql.SQLException;
import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@RunWith(JUnitPlatform.class)
@DisplayName("EmpDao Test->")
public class EmpTest {
	
	
	@Test
	public void testEmp1(){
		Emp e1=new Emp(1001,"ram",9000);
		Emp e2=new Emp(1001,"ram",9000);
		assertEquals(e1,e2);
	}
	@Test
	public void testEmp2() throws NotFoundException, ClassNotFoundException, SQLException{
		EmpService ser=Factory.getEmpService();
		assumeTrue(ser!=null);
		Emp expected=new Emp(2,"Tarun Joshi",40000.0);
		assertEquals(expected,ser.getEmployee(2));
	}
	@Test 
	@DisplayName("Test Employee by Id: 7")
	public void testEmp3() throws NotFoundException, ClassNotFoundException, SQLException{
		EmpService ser=Factory.getEmpService();
		assumeTrue(ser!=null);
		Emp expected=new Emp(7,"Sam",50000.0);
		Emp actual =ser.getEmployee(7);
		assertAll("test all states",
				()->assertEquals(expected.getEmpId(),actual.getEmpId()),
				()->assertEquals(expected.getEmpName(),actual.getEmpName()),
				()->assertEquals(expected.getSal(),actual.getSal()) );
		
	}
	@Test
	@DisplayName("Expecting not found Exception")
	public void testEmp4() throws NotFoundException{
		EmpService ser=Factory.getEmpService();
		assumeTrue(ser!=null);
		assertThrows(NotFoundException.class,()->ser.getEmployee(16));
	}

}
