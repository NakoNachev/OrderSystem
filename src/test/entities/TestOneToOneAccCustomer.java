package test.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Account;
import entities.Customer;

public class TestOneToOneAccCustomer {

	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Account.class)
				.addAnnotatedClass(Customer.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Account acc = new Account("test3","test3");
			
			Customer customer = new Customer();
			
			customer.setAccount(acc);
			
			session.save(customer);
			
			session.getTransaction().commit();
			System.out.println("Completed transaction");
			
		} finally {factory.close(); }
		

	}

}
