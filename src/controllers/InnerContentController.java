package controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import business.logic.HomePageChoice;
import entities.Item;
import entities.Order;
import services.ItemService;
import services.OrderService;

/**
 * Controls the pages after successful login.
 * @author Asus
 *
 */
@Controller
public class InnerContentController {
	
	private OrderService oService;
	private ItemService iService;
	
	@RequestMapping("/submitAction")
	public String handleHomeChoice(@ModelAttribute("choice") HomePageChoice choice, Model model) {
		
		//control for the choice in the homepage regarding orders
		switch(choice.getChoice()) {

		case "Place order":
			
			oService = new OrderService();
			Order order = new Order();
			model.addAttribute("newOrder",order);
			
			return "placeOrder";
		
		case "Account info":
			return "accountInfoForm";
			
		case "Items list":
			iService = new ItemService();
			List<Item> items = iService.findAll();
			model.addAttribute("items",items);
			return "viewItemInfo";
		
		default:
			
			//add all existing orders to be displayed on the page
			oService = new OrderService();
			List<Order> orders = oService.findAll();
			model.addAttribute("orders",orders);
			
			return "displayOrders";
		}
	}
	

}
