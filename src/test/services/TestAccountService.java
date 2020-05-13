package test.services;

import dao.AccountDao;
import entities.Account;
import services.AccountService;

public class TestAccountService {

	public static void main(String[] args) {
//		AccountDao dao = new AccountDao();
//		Account acc = new Account("nako","123");
//		
//		dao.openSessionWithTransaction();
//		dao.getCurrentTransaction().begin();
//		dao.getCurrentSession().save(acc);
//		dao.getCurrentSession().getTransaction().commit();
//		System.out.println("Done");
	
		
		
		AccountService service = new AccountService();
		Account acc2 = new Account("nako2","1234");
		service.persist(acc2);
}
}
