package test.services;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class TestSessionFactory {
	
	@Autowired
	public SessionFactory sessionFactory;
	


	public static void main(String[] args) {
		
		
		try {
			
			TestSessionFactory test = new TestSessionFactory();
			System.out.println(test.sessionFactory);
			
		}catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
