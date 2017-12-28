package com.sapient.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


import com.sapient.service.Palindrome;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(JUnitPlatform.class)
public class PalindromeTest {
	
	private static Palindrome ser;
	
	@BeforeAll
	public static void beforeAll(){
		ser = new Palindrome();		
	}
	
	@AfterAll
	public static void afterAll(){
		ser = null;
	}
	
@Test
public void testPalindrome1(){
	assertFalse(ser.checkPalindrome("rama"));
}

@Test
public void testPalindrome2(){
	assertTrue(ser.checkPalindrome("nitin"));
}

@Test
public void testPalindrome3(){
	assertFalse(ser.checkPalindrome(null));
}

@Test
public void testPalindrome4(){
	assertTrue(ser.checkPalindrome("malayalam"));
}

@Test
public void testPalindrome5(){
	assertFalse(ser.checkPalindrome(""));
}
}
