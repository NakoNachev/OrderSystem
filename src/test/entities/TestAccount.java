package test.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Account;

public class TestAccount {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Account.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
			Account acc = new Account("test","test");
			
			session.beginTransaction();
			
			session.save(acc);
			
			session.getTransaction().commit();
			System.out.println("Account "+ acc + " was saved successfully to db");
					
		} finally {
			factory.close();
		}

	}

}
