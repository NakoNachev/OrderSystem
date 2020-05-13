package dao;

import java.util.List;

import org.hibernate.Session;

import entities.Item;
import interfaces.GenericDao;
import interfaces.SessionControlInterface;

public class ItemDao implements GenericDao<Item>, SessionControlInterface {

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
	public void persist(Item entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Item entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Item findByID(int id) {
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
