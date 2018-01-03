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


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;


@RunWith(JUnitPlatform.class)
public class ParameterTest2 {

@ParameterizedTest
@CsvSource({"5,5,10,10.0","5,5,5,7.5"})
public void testSeries(int a,int b,int c,double expected){
	CalcService ser = new CalcService();
	double actual = ser.calcSeries(a,b,c);
	assertEquals(expected,actual);
} 

}
	



