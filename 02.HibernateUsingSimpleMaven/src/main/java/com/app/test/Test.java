package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.app.model.Emplo;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure(); // loads hibernate.cfg.xml fill
		// cfg.configure("hibernate.cfg.xml"); // loads hibernate.cfg.xml fill
		//don't use standardServiceRegistryBuilder
		StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties()).configure();
		SessionFactory sf = cfg.buildSessionFactory(registryBuilder.build());
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		Emplo emp = new Emplo();
		emp.setEmpId(100);
		emp.setEmpName("ABC");
		emp.setEmpSal(1236);
		ses.save(emp);
		tx.commit();
		ses.close();
		System.out.println("Record inserted..");

	}

}
