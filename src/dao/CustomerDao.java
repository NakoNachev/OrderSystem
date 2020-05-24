package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import business.logic.SessionTransactionControl;
import entities.Account;
import entities.Customer;
import entities.ItemCategory;
import interfaces.GenericDao;
import interfaces.SessionControlInterface;

public class CustomerDao extends SessionTransactionControl implements GenericDao<Customer>{

	public CustomerDao() {
		
	}
	
	@Override
	public void persist(Customer entity) {
		super.getCurrentSession().save(entity);
		
	}

	@Override
	public void update(Customer entity) {
		super.getCurrentSession().update(entity);
		
	}

	@Override
	public Customer findByID(String id) {
		Customer customer = super.getCurrentSession().get(Customer.class, id);
		return customer;
	}

	@Override
	public void delete(Customer entity) {
		super.getCurrentSession().delete(entity);
		
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = super.getCurrentSession().createQuery("from customers").getResultList();
		return customers;
	}

}
