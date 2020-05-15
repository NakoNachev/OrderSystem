package test.services;

import java.util.List;

import entities.Account;
import services.AccountService;

public class TestGetAccounts {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccName("nako");
		acc.setPassword("23456");
		
		
		AccountService service = new AccountService();
		List<Account> accs = service.findAll();
		
		for (Account account : accs) {
			System.out.println(acc.getAccName().equals(account.getAccName()) & acc.getPassword().equals(account.getPassword()));
		}

	}

}
