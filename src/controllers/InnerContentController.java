package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import business.logic.HomePageChoice;

/**
 * Controls the pages after successful login.
 * @author Asus
 *
 */
@Controller
public class InnerContentController {
	
	@RequestMapping("/submitAction")
	public String handleHomeChoice(@ModelAttribute("choice") HomePageChoice choice) {
		
		switch(choice.getChoice()) {

		case "Place order":
			return "placeOrder";
		case "Account info":
			return "accountInfoForm";
		default: 
			return "displayOrders";
		}
	}
	

}
