package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Account;
import entities.Customer;
import interfaces.GenericDao;
import interfaces.SessionControlInterface;

public class CustomerDao implements GenericDao<Customer>, SessionControlInterface {
	
	
	private static SessionFactory getSessionFactory() {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Account.class)
				.addAnnotatedClass(Customer.class)
				.buildSessionFactory();
		
		return factory;
	}

	@Override
	public Session openCurrentSession() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session openCurrentSessionWithTransaction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeCurrentSession() {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeCurrentSessionWithTransaction() {
		// TODO Auto-generated method stub

	}

	@Override
	public void persist(Customer entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Customer entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer findByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Customer entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
