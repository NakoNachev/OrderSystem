package dao;

import java.util.List;



import business.logic.SessionTransactionControl;
import entities.Item;
import entities.ItemCategory;
import interfaces.GenericDao;
import interfaces.SessionControlInterface;

public class ItemDao extends SessionTransactionControl implements GenericDao<Item>{

	public ItemDao() {
		
	}
	
	@Override
	public void persist(Item entity) {
		super.getCurrentSession().save(entity);
		
	}

	@Override
	public void update(Item entity) {
		super.getCurrentSession().saveOrUpdate(entity);
		
	}

	@Override
	public Item findByID(String id) {
		Item item = super.getCurrentSession().get(Item.class, id);
		return item;
	}

	@Override
	public void delete(Item entity) {
		super.getCurrentSession().delete(entity);
		
	}

	@Override
	public List<Item> findAll() {
		List<Item> items = super.getCurrentSession().createQuery("from items").getResultList();	
		return items;
	}

}
