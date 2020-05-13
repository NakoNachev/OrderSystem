package dao;

import java.util.List;

import org.hibernate.Session;

import entities.Customer;
import interfaces.GenericDao;
import interfaces.SessionControlInterface;

public class CustomerDao implements GenericDao<Customer>, SessionControlInterface {

	@Override
	public Session openCurrentSession() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session openCurrentSessionwithTransaction() {
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
	public Customer findByID(int id) {
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
