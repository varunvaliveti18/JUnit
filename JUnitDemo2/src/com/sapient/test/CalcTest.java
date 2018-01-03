package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.CalcService;
import com.sapient.service.Factory;

@RunWith(JUnitPlatform.class)
public class CalcTest {
	
	@Test
	public void testSerie1s(){
		CalcService ser = Factory.getCalcService();
		assumeTrue(ser != null);
		assertEquals(7.5,ser.calcSeries(5,5,5));
	}
	
	@Test
	public void testSeries2(){
		CalcService ser = Factory.getCalcService();
		assumingThat(ser!=null, ()->assertEquals(10.0, ser.calcSeries(5, 5, 10))); //introduced in junit 5
	
	}

}
