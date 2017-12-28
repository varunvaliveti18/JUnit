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

import com.sapient.service.AgeException;
import com.sapient.service.CalcService;
import com.sapient.service.IncomeException;
import com.sapient.service.LoanService;

@RunWith(JUnitPlatform.class)
public class LoanTest {
private static 	LoanService ser;

@BeforeAll
public static void beforeAll(){
	ser =  new LoanService();
	
	
}

@AfterAll
public static void afterAll(){
	ser = null;
}

@Tag("prod")
@Test
public void testLoan1() throws AgeException,IncomeException{
	assertEquals("approved", ser.approveLoan(20,400000));
}

@Tag("prod")
@Test
public void testLoan2() throws AgeException,IncomeException{
	assertEquals("approved", ser.approveLoan(40,400000));
}

@Tag("prod")
@Test
public void testLoan3() throws AgeException,IncomeException{
	assertThrows(AgeException.class, ()->ser.approveLoan(17,600000));
}

@Tag("dev")
@Test
public void testLoan4() throws AgeException,IncomeException{
	assertThrows(AgeException.class, ()->ser.approveLoan(19,400000));
}

@Tag("dev")
@Tag("prod")
@Test
public void testLoan5() throws AgeException,IncomeException{
	assertThrows(IncomeException.class, ()->ser.approveLoan(25,390000));
}

}
