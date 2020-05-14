package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import business.logic.Address;

@Entity
@Table(name="couriers")
public class Courier {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="courier_name")
	private String courierName;
	
	@Column(name="address")
	private Address address;
	
	@Column(name="outstanding_orders_number")
	private int outstandingOrders;
	
	@Column(name="contact_email")
	private String email;
	
	@Column(name="contact_number")
	private String telephoneNumber;
	
	private String streetName;
	private int streetNumber;
	private int postalCode;
	private String country;
	
	

	public String getCourierName() {
		return courierName;
	}

	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		this.country = this.address.getCountry();
		this.postalCode = this.address.getPostalCode();
		this.streetName = this.address.getStreetName();
		this.streetNumber = this.address.getStreetNumber();
	}

	public int getOutstandingOrders() {
		return outstandingOrders;
	}

	public void setOutstandingOrders(int outstandingOrders) {
		this.outstandingOrders = outstandingOrders;
	}
	

	
	
	

}
