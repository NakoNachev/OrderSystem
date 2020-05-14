package services;

import java.util.ArrayList;
import java.util.List;

import dao.AccountDao;
import entities.Account;


/**
 * Service class, implementing all the db operations from the dao class.
 * @author Asus
 *
 */
public class AccountService {
	
	private static AccountDao accDao;
	
	public AccountService() {
		accDao = new AccountDao();
	}
	
	public void persist(Account entity) {
		accDao.openCurrentSessionWithTransaction();
		accDao.persist(entity);
		accDao.closeCurrentSessionWithTransaction();
	}
	
	public void update(Account entity) {
		accDao.openCurrentSessionWithTransaction();
		accDao.update(entity);
		accDao.closeCurrentSessionWithTransaction();
	}
	
	public Account findById(String id) {
		
		accDao.openCurrentSession();
		Account acc = accDao.findByID(id);
		accDao.closeCurrentSession();
		return acc;
	}
	
	public void delete(Account entity) {
		
		accDao.openCurrentSessionWithTransaction();
		accDao.delete(entity);
		accDao.closeCurrentSessionWithTransaction();
	}
	
	public List<Account> findAll() {
		
		List<Account> accounts = new ArrayList<Account>();
		accDao.openCurrentSessionWithTransaction();
		accounts = accDao.findAll();
		accDao.closeCurrentSessionWithTransaction();
		
		return accounts;
		
	}

}
