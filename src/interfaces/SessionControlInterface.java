/**
 * 
 */
package interfaces;

import org.hibernate.Session;

/**
 * @author Asus
 *
 */
public interface SessionControlInterface {
	
	public Session openCurrentSession();
	public Session openCurrentSessionwithTransaction();
	public void closeCurrentSession();
	public void closeCurrentSessionWithTransaction();
	
}
