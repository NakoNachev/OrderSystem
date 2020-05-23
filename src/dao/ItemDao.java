package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import business.logic.SessionTransactionControl;
import entities.Item;
import entities.ItemCategory;
import interfaces.GenericDao;
import interfaces.SessionControlInterface;

public class ItemDao extends SessionTransactionControl implements GenericDao<Item>{


	
	
	@Override
	public void persist(Item entity) {
		super.getCurrentSession().save(entity);
		
	}

	@Override
	public void update(Item entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Item findByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Item entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
