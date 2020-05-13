package dao;

import java.util.List;

import org.hibernate.Session;

import entities.Order;
import interfaces.GenericDao;
import interfaces.SessionControlInterface;

public class OrderDao implements GenericDao<Order>, SessionControlInterface {

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
	public void persist(Order entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Order entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Order entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
