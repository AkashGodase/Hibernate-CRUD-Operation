package com.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Controller {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate-config.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
//		Session session = sf.openSession();
//		Transaction tr = session.beginTransaction();

		Student s1 = new Student();

		s1.setId(1);
		s1.setName("Sumit");
		s1.setAddr("nagar");
		s1.setClg("SB clg");

		Student s2 = new Student();

		s2.setId(102);
		s2.setName("Akash");
		s2.setAddr("Sangamner");
		s2.setClg("D Y Patil Clg Pune");

		Student s3 = new Student();

		s3.setId(103);
		s3.setName("Abhishek");
		s3.setAddr("Kolhapur");
		s3.setClg("D Y Patil Clg Pune");

		Student s4 = new Student();

		s4.setId(104);
		s4.setName("Amar");
		s4.setAddr("Pune");
		s4.setClg("D Y Patil Clg Pune");

		Session session = sf.openSession();
		Collection<Student> ll = new ArrayList<>();
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);
		ll.add(s4);

		for (Student s : ll) {
			session.save(s);
			System.out.println("Saved");
		}
		Transaction tx = session.beginTransaction();
		tx.commit();
		System.out.println("Comitted");
//		try {
//			
//			
//			List<Student> dataList = new ArrayList<>();
//			
//			/*
//			 * dataList.add(new Student( Data for record 1 )); dataList.add(new Student(
//			 * Data for record 2 )); // Add more records as needed
//			 */
//			dataList.add(s1);
//			dataList.add(s2);
//			dataList.add(s3);
//			dataList.add(s4);
//			
//			
//			for (Student entity : dataList) {
//				
//				System.out.println("Step4");
//				
//			session.persist(entity);
//			System.out.println("Step5");
//			
//			
//			}
//
//			tr.commit();
//		} catch (Exception e) {
//			if (tr != null) {
//				tr.rollback();
//			}
//			e.printStackTrace();
//		} finally {
//			System.out.println("Step6");
//			
//			session.close();
//		}
	}
}