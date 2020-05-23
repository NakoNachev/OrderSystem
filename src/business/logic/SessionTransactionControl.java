package business.logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.ItemDao;
import entities.Account;
import entities.Courier;
import entities.Customer;
import entities.Item;
import entities.ItemCategory;
import entities.Order;
import interfaces.SessionControlInterface;


/**
 * Should provide the needed implementation of session and transaction control,
 * to be used by the dao classes.
 * @author Asus
 *
 */
public class SessionTransactionControl implements SessionControlInterface {

	Session currentSession;
	Transaction currentTransaction;
	
	private static SessionFactory getSessionFactory() {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		
		return factory;
	}
	
	
	
	@Override
	public Session openCurrentSession() {
		this.currentSession = getSessionFactory().openSession();
		return null;
	}

	@Override
	public Session openCurrentSessionWithTransaction() {
		this.currentSession = getSessionFactory().openSession();
		this.currentTransaction = this.currentSession.beginTransaction();
		return null;
	}

	@Override
	public void closeCurrentSession() {
		
		if (this.currentSession != null) {
			this.currentSession.close();
		}
		
	}

	@Override
	public void closeCurrentSessionWithTransaction() {
		this.currentTransaction.commit();
		this.currentSession.close();
		
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
