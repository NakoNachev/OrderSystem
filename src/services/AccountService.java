package services;

import dao.AccountDao;
import entities.Account;

public class AccountService {
	
	private static AccountDao accDao;
	
	public AccountService() {
		accDao = new AccountDao();
	}
	
	public void persist(Account entity) {
		accDao.openSessionWithTransaction();
		accDao.persist(entity);
		accDao.closeCurrentSessionWithTransaction();
	}
	

}
