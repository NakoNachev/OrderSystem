package test.entities;

import entities.Item;
import entities.ItemCategory;
import services.ItemService;

public class AddNewItem {
	
	
	
	public static void main(String args[]) {
		
		ItemService itemService = new ItemService();
		
		Item item = new Item("test6",5);
		ItemCategory category = new ItemCategory();
		item.setItemCategory(category);
		
		itemService.persist(item);
		
	}
	


}
