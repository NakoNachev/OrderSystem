package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private String addressS;
	
//	private Address address;
	
	@Column(name="outstanding_orders_number")
	private Integer outstandingOrders;
	
	@Column(name="contact_email")
	private String email;
	
	@Column(name="contact_number")
	private String telephoneNumber;

	public String getCourierName() {
		return courierName;
	}

	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}


	public int getOutstandingOrders() {
		return outstandingOrders;
	}

	public void setOutstandingOrders(int outstandingOrders) {
		this.outstandingOrders = outstandingOrders;
	}

	public String getAddressS() {
		return addressS;
	}

	public void setAddressS(String addressS) {
		this.addressS = addressS;
	}
	

	
	
	

}
