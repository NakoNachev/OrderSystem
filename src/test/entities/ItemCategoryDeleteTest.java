package test.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Item;
import entities.ItemCategory;

public class ItemCategoryDeleteTest {

	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Item.class)
				.addAnnotatedClass(ItemCategory.class)
				.buildSessionFactory();

		
		Session session = factory.getCurrentSession();
		
		try { 
			
			session.beginTransaction();
			
			
			ItemCategory category = session.get(ItemCategory.class, 1);
			Item item = session.get(Item.class, 1);
			
			// set reference of category inside the item to null, so that fk constraint won't fail
			item.setItemCategory(null);
			session.save(item);
			
			session.delete(category);
			
			session.getTransaction().commit();
			
			
		}
		finally {factory.close(); }
		

	}

}
