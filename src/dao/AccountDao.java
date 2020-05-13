package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entities.Account;
import entities.Customer;
import interfaces.GenericDao;
import interfaces.SessionControlInterface;

public class AccountDao implements GenericDao<Account>,SessionControlInterface {
	
	private Session currentSession;
	private Transaction currentTransaction;
	
	public AccountDao() {
		
	}
	
	public Session openCurrentSession() {
		this.currentSession = getSessionFactory().openSession();
		return this.currentSession;
	}
	
	private static SessionFactory getSessionFactory() {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Account.class)
				.addAnnotatedClass(Customer.class)
				.buildSessionFactory();
		
		return factory;
	}
	
	public void openSessionWithTransaction() { 
		
		this.currentSession = getSessionFactory().openSession();
		this.currentTransaction = this.currentSession.beginTransaction();
	}
	
	public void beginTransaction() {
		
		openSessionWithTransaction();
		this.currentTransaction.begin();
	}
	
	public Transaction getCurrentTransaction() {
		
		return this.currentTransaction;
	}
	
	public Session getCurrentSession() {
		
		return this.currentSession;
	}
	
	public void closeCurrentSession() {
		currentSession.close();
	}
	
	public void closeCurrentSessionWithTransaction() {
		
		this.currentTransaction.commit();
		this.currentSession.close();
	}
	
	@Override
	public Session openCurrentSessionwithTransaction() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void persist(Account entity) {
		getCurrentSession().save(entity);
		
	}

	@Override
	public void update(Account entity) {
		getCurrentSession().update(entity);
		
	}

	@Override
	public Account findByID(int id) {
		
		Account acc = getCurrentSession().get(Account.class, id);
		return acc;
	}

	@Override
	public void delete(Account entity) {
		getCurrentSession().delete(entity);
		
	}

	@Override
	public List<Account> findAll() {
		List<Account> accounts = getCurrentSession().createQuery("from accounts").getResultList();
		return accounts;
	}

	

}
