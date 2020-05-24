package dao;

import java.util.List;

import business.logic.SessionTransactionControl;
import entities.Courier;
import entities.Customer;
import interfaces.GenericDao;

public class CourierDao extends SessionTransactionControl implements GenericDao<Courier>{

	public CourierDao() {
		
	}
	
	@Override
	public void persist(Courier entity) {
		super.getCurrentSession().save(entity);
	}

	@Override
	public void update(Courier entity) {
		super.getCurrentSession().update(entity);
		
	}

	@Override
	public Courier findByID(String id) {
		Courier courier = super.getCurrentSession().get(Courier.class, id);
		return courier;
	}

	@Override
	public void delete(Courier entity) {
		super.getCurrentSession().delete(entity);
		
	}

	@Override
	public List<Courier> findAll() {
		List<Courier> couriers = super.getCurrentSession().createQuery("from couriers").getResultList();
		return couriers;
	}


}
