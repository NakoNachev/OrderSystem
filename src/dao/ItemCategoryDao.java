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

public class ItemCategoryDao extends SessionTransactionControl implements GenericDao<ItemCategory> {

	public ItemCategoryDao() {
		
	}
	
	@Override
	public void persist(ItemCategory entity) {
		super.getCurrentSession().save(entity);
		
	}

	@Override
	public void update(ItemCategory entity) {
		super.getCurrentSession().update(entity);
		
	}

	@Override
	public ItemCategory findByID(String id) {
		ItemCategory category = super.getCurrentSession().get(ItemCategory.class, id);
		
		return category;
	}

	@Override
	public void delete(ItemCategory entity) {
		super.getCurrentSession().delete(entity);
		
	}

	@Override
	public List<ItemCategory> findAll() {
		List<ItemCategory> categories = super.getCurrentSession().createQuery("from item_categories").getResultList();
		return categories;
	}

}
