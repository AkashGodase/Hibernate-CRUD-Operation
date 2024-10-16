package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Controller {

	void connect() {
		
		System.out.println("step1");
		
		Configuration cfg = new Configuration();
		
		System.out.println("step2");

		cfg.configure("hibernate-config.xml");
		System.out.println("step3");

		cfg.addAnnotatedClass(LoginPage.class);
		System.out.println("step4");

		SessionFactory sf = cfg.buildSessionFactory();
		System.out.println("step5");

		Session session = sf.openSession();
		System.out.println("step6");

		LoginPage lp = new LoginPage();
		System.out.println("step7");

		session.save(lp);

		System.out.println("Data Saved to database..!");
		
		session.close();
		
	}
	
}
