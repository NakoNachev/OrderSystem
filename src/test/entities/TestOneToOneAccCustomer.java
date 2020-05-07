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
			
//			session.beginTransaction();
//			
//			Account acc = new Account("test3","test3");
//			
//			Customer customer = new Customer();
//			
//			customer.setAccount(acc);
//			
//			session.save(customer);
//			
//			session.getTransaction().commit();
//			System.out.println("Completed transaction");
			
			// new test
			
//			session.beginTransaction();
//			
//			Account acc = new Account("test5", "test5");
//			Customer customer = new Customer();
//			
//			session.save(customer);
//			
//			
//			session.getTransaction().commit();
			
			
			session.beginTransaction();
			Account acc = session.get(Account.class, "test7");
			
			
			acc.getCustomer().setAccount(null);
			//customer.getAccount().setCustomer(null);
			session.delete(acc);
			session.getTransaction().commit();
			
			
			
		} finally {factory.close(); }
		

	}

}
