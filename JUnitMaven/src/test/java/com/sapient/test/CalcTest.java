package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith; 

import com.sapient.service.CalcService;

@RunWith(JUnitPlatform.class)
public class CalcTest {

	private static CalcService ser;
	
	@BeforeAll
	public static void beforeAll(){
		ser =  new CalcService();
		System.out.println("before all");
		
	}
	
	@AfterAll
	public static void afterAll(){
		System.out.println("after all");
	}
	
	@BeforeEach
	public  void beforeEach(){
		System.out.println("before each");
	}
	
	@AfterEach
	public void after(){
		System.out.println("after each");
	}
	@Tag("prod")
	@Test
	public void seriestest1(){
		System.out.println("test1");
		double expected = 10.0;
		double actual = ser.calcSeries(5, 5, 10);
		assertEquals(expected,actual);
	}
	
	@Tag("dev")
	@Test
	public void seriestest2(){
		System.out.println("test2");
		
		double expected = 7.5;
		double actual = ser.calcSeries(5, 5, 5);
		assertEquals(expected,actual);
	}
}
