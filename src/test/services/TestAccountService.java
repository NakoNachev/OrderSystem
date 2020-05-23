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
	
		
		try {
			
			AccountService service = new AccountService();
			
			
			Account acc = service.findById("nako");
			acc.setPassword("23456");
			service.update(acc);
			
		} catch (Throwable exc) {
			
			exc.printStackTrace();
		}

}
}
