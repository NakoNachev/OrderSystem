package interfaces;

import java.util.List;


/**
 * Just a generic dao interface to be implemented for the entities
 * @author Asus
 *
 * @param <T>
 */
public interface GenericDao<T> {
	
	
	public void persist(T entity);
	
	public void update(T entity);
	
	public T findByID(String id);
	
	public void delete(T entity);
	
	public List<T> findAll();

}
