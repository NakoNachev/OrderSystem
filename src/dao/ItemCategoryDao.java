package dao;

import java.util.List;

import org.hibernate.Session;

import entities.ItemCategory;
import interfaces.GenericDao;
import interfaces.SessionControlInterface;

public class ItemCategoryDao implements GenericDao<ItemCategory>, SessionControlInterface {

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
	public void persist(ItemCategory entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ItemCategory entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemCategory findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(ItemCategory entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ItemCategory> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
