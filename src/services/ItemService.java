package services;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import business.logic.SessionTransactionControl;
import dao.ItemDao;
import entities.Item;
import entities.ItemCategory;
import interfaces.GenericDao;

public class ItemService implements GenericDao<Item> {

	private ItemDao itemDao;
	
	public ItemService() {
		itemDao = new ItemDao();
	}

	
	@Override
	public void persist(Item entity) {
		itemDao.openCurrentSessionWithTransaction();
		itemDao.persist(entity);
		itemDao.closeCurrentSessionWithTransaction();
		
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
