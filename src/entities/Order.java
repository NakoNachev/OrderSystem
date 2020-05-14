package entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="orders")
public class Order {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToMany
	@JoinColumn(name="item_id")
	private Item item;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@OneToOne
	@JoinColumn(name="courier_id")
	private Courier courier;
	
	@Column(name="delivery_date")
	private Date deliveryDate;
	
	@Column(name="order_date")
	private Date orderSetDate;
	
	
	public Order() {
		
	}


	public Item getItem() {
		return item;
	}


	public void setItem(Item item) {
		this.item = item;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Courier getCourier() {
		return courier;
	}


	public void setCourier(Courier courier) {
		this.courier = courier;
	}


	public Date getDeliveryDate() {
		return deliveryDate;
	}


	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}


	public Date getOrderSetDate() {
		return orderSetDate;
	}


	public void setOrderSetDate(Date orderSetDate) {
		this.orderSetDate = orderSetDate;
	}


	@Override
	public String toString() {
		return "Order [item=" + item + ", customer=" + customer + ", courier=" + courier + ", deliveryDate="
				+ deliveryDate + ", orderSetDate=" + orderSetDate + "]";
	}
	
	
	

}
