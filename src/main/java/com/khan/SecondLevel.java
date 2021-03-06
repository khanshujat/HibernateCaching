package com.khan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.khan.Entity.User;

public class SecondLevel {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		User user=session.get(User.class, 10);
		System.out.println("User Name="+user.getName());
		System.out.println("User Email="+user.getEmail());
		System.out.println("User Mobile="+user.getMobile());
		session.close();
		
		
		System.out.println("Something working here");
		
		Session session1 = factory.openSession();
        User user1=session.get(User.class, 10);
		System.out.println("User Name="+user1.getName());
		System.out.println("User Email="+user1.getEmail());
		System.out.println("User Mobile="+user1.getMobile());
		session1.close();
		
		factory.close();

	}

}
