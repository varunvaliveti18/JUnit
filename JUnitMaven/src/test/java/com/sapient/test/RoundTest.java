package com.sapient.test;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import static org.junit.jupiter.api.Assertions.*;

import com.sapient.service.CalcService; 

@RunWith(JUnitPlatform.class)
public class RoundTest {
	
	@Test
	public void testRound1(){
		CalcService ser = new CalcService();
		double expected = 56.328;
		double actual = ser.round2N(56.32768, 3);
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testRound2(){
		CalcService ser = new CalcService();
		double expected = 56.32;
		double actual = ser.round2N(56.3248, 2);
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testRound3(){
		CalcService ser = new CalcService();
		double expected = 56.33;
		double actual = ser.round2N(56.32768, 2);
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testRound4(){
		CalcService ser = new CalcService();
		double expected = 56.3277;
		double actual = ser.round2N(56.32768, 4);
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testRound5(){
		CalcService ser = new CalcService();
		double expected = 57;
		double actual = ser.round2N(56.72768, 0);
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testRound6(){
		CalcService ser = new CalcService();
		double expected = 56;
		double actual = ser.round2N(56.32768, 0);
		assertEquals(expected,actual);
		
	}

}
