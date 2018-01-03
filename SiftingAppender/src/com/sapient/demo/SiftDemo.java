package com.sapient.demo;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;



public class SiftDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the role");
		String role = scan.next();
		Logger log = LoggerFactory.getLogger("sapient");
		log.info("main starts");
		if (role.equals("admin")) {
			MDC.put("userRole", "admin");
			log.debug("Admin Action debug");
			log.info("Admin Action info");
			log.warn("Admin Action warn");
			log.error("Admin Action error");
		} else if (role.equals("user")) {
			MDC.put("userRole", "user");
			log.debug("User Action debug");
			log.info("User Action info");
			log.warn("user action warn");
			log.error("user action error");
		}
log.info("main ends");
	}

}
