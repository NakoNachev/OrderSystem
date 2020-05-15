package controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import entities.Account;
import services.AccountService;


/**
 * Responsible for handling the requests for login/register of accounts
 * @author Asus
 *
 */
@Controller
public class LRController {
	
	@RequestMapping("/registerForm")
	public String showRegForm(Model model) {
		
		Account acc = new Account();
		model.addAttribute("account",acc);
		
		return "register-user";
	}
	
	@RequestMapping("/loginForm")
	public String showLoginForm(Model model) {
		Account accToLogin = new Account();
		model.addAttribute("accToLogin", accToLogin);
		
		return "login-user";
	}
	
	
	
	@RequestMapping("/verifyReg")
	public String verifyReg(@Valid @ModelAttribute("account") Account acc,
			BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			return "register-user";
		}
		else {
			AccountService service = new AccountService();
			service.persist(acc);
			return "reg-verify";
		}
	}
	
	@RequestMapping("/loginUser")
	public String executeLogin(@ModelAttribute("accToLogin") Account accToLogin) {
		
		AccountService service = new AccountService();
		List<Account> existingAccs = service.findAll();
		boolean found = false;
		
		for(Account acc : existingAccs) {
			if (acc.getAccName().equals(accToLogin.getAccName()) & acc.getPassword().equals(accToLogin.getPassword())) {
				found = true;
			}
		}
		
		if (found) {
			return "home-page";
		}
		else {
			System.out.println("User was not found!");
			return "login-user";
		}
		
	}

}
