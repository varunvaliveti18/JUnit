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
import com.sapient.service.Palindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@RunWith(JUnitPlatform.class)
public class ParameterTest {

	private static Palindrome obj;
	
	@BeforeAll
	public static void beforeAll(){
		obj = new Palindrome();		
	}
	
	@AfterAll
	public static void afterAll(){
		obj = null;
	}
@ParameterizedTest
@ValueSource(strings={"nitin","kayak","malayalam"})
public void testPalindrome1(String str){
	assertTrue(obj.checkPalindrome(str));
}

@ParameterizedTest
@ValueSource(strings={"rama","on","satyam"})
public void testPalindrome2(String str){
	assertFalse(obj.checkPalindrome(str));
}
}
