package entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

//will use ManyToOne relationship, since will contain, customerID, courierID
@Entity
@Table(name="orders")
public class Order {
	
	private int id;
	private Item item;
	private Customer customer;
	private Courier courier;
	private Date deliveryDate;
	private Date orderSetDate;
	

}
