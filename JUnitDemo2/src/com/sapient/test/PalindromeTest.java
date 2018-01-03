package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.Factory;
import com.sapient.service.Palindrome;

@RunWith(JUnitPlatform.class)
public class PalindromeTest {
	
	@Test
	public void testReverse1(){
		Palindrome ser = Factory.getPalindromeService();
		assumeTrue(ser!=null);
		String[] input = Factory.getInput();
		assumeTrue(input != null && input.length >= 10);
		assertTimeout(Duration.ofNanos(10), ()->ser.reverseName(input));
		
 		
	}

}
