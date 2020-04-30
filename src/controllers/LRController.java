package controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import beans.Account;


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
	public String showLoginForm() {
		
		return "login-user";
	}
	
	
	
	@RequestMapping("/verifyReg")
	public String verifyReg(@Valid @ModelAttribute("account") Account acc,
			BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			return "register-user";
		}
		else {
			return "reg-verify";
		}
	}

}
