package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		JdbcTemplate jt = (JdbcTemplate) context.getBean("jtObj");
		String sql = "insert into employee values(?,?,?)";
		int count = jt.update(sql, 20, "AfBC", 36636);
		System.out.println(count);

	}

}
