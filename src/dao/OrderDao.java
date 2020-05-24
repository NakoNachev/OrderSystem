package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entities.Account;
import entities.Courier;
import entities.Customer;
import entities.Item;
import entities.Order;
import interfaces.GenericDao;
import interfaces.SessionControlInterface;

public class OrderDao implements GenericDao<Order>, SessionControlInterface {

	private Session currentSession;
	private Transaction currentTransaction;
	
	
	private static SessionFactory getSessionFactory() {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Account.class)
				.addAnnotatedClass(Customer.class)
				.addAnnotatedClass(Item.class)
				.addAnnotatedClass(Courier.class)
				.buildSessionFactory();
		
		return factory;
	}

	@Override
	public Session openCurrentSession() {
		this.currentSession = getSessionFactory().openSession();
		return this.currentSession;
	}

	@Override
	public Session openCurrentSessionWithTransaction() {
		this.currentSession = getSessionFactory().openSession();
		this.currentTransaction = this.currentSession.beginTransaction();
		return null;
	}

	@Override
	public void closeCurrentSession() {
		this.currentSession.close();

	}

	@Override
	public void closeCurrentSessionWithTransaction() {
		
		this.currentTransaction.commit();
		this.currentSession.close();
	}

	@Override
	public void persist(Order entity) {
		this.currentSession.save(entity);
	
	}

	@Override
	public void update(Order entity) {
		this.currentSession.saveOrUpdate(entity);
		
	}

	@Override
	public void delete(Order entity) {
		this.currentSession.delete(entity);
		
	}

	@Override
	public List<Order> findAll() {
		
		List<Order> orders = getCurrentSession().createQuery("from Order o").getResultList();
		return orders;

	}

	@Override
	public Order findByID(String id) {
		Order order = getCurrentSession().get(Order.class, id);
		return order;
	}

	public Session getCurrentSession() {
		return currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}
	
	

}
