package com.sapient.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)

//SelectClasses({CalcTest.class,RoundTest.class,ReverseNameTest.class,PalindromeTest.class,LoanTest.class})	
	
@SelectPackages("com.sapient.test")
@IncludeTags({"prod","dev"})
public class AllTests {
}
