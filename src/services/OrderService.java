package services;

import java.util.List;

import dao.OrderDao;
import entities.Order;
import interfaces.GenericDao;

public class OrderService implements GenericDao<Order> {
	
	private static OrderDao orderDao;
	
	public OrderService() {
		orderDao = new OrderDao();
	}

	@Override
	public void persist(Order entity) {
	
		orderDao.openCurrentSessionWithTransaction();
		orderDao.persist(entity);
		orderDao.closeCurrentSessionWithTransaction();
		
	}

	@Override
	public void update(Order entity) {
		
		orderDao.openCurrentSessionWithTransaction();
		orderDao.update(entity);
		orderDao.closeCurrentSessionWithTransaction();
		
	}

	// Needs only a session to use the .get function, no need for transaction
	// since there is nothing to commit
	@Override
	public Order findByID(String id) {
		orderDao.openCurrentSession();
		Order order = orderDao.findByID(id);
		orderDao.closeCurrentSession();
		return order;
	}

	@Override
	public void delete(Order entity) {
		orderDao.openCurrentSessionWithTransaction();
		orderDao.delete(entity);
		orderDao.closeCurrentSessionWithTransaction();
		
	}

	@Override
	public List<Order> findAll() {
		List<Order> orders;
		orderDao.openCurrentSessionWithTransaction();
		orders = orderDao.findAll();
		orderDao.closeCurrentSessionWithTransaction();
		return orders;
	}

	

	

}
