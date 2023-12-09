
package com.app.mj;

import org.apache.log4j.Logger;

public class DbFileAppenderwithPattern {
	private static Logger log = Logger.getLogger(DbFileAppenderwithPattern.class); //for all

	public static void main(String[] args) {
		log.debug("Hello"); 
		System.out.println();
		 log.info("Hello");
		 System.out.println();
		 log.warn("Hello");
		 System.out.println();
		 log.error("Hello");
		 System.out.println();
		 log.fatal("Hello");
	

	}
}