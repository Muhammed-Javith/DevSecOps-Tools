package com.app.mj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RAGHU
 * @version JDK 1.7
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Object ob = context.getBean("empObj");
		if (ob instanceof Employee) {
			Employee emp = (Employee) ob;
			System.out.println(emp);
		} else {
			System.out.println("object is not employee type");
		}
	}
}
