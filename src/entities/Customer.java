package entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="customer_data")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customer_id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="acc_name")
	private Account account;
	
	@Column(name="email")
	private String email;
	
	@Column(name="delivery_address")
	private String delivery_address;
	
	@Column(name="delivery_city")
	private String delivery_city;
	
	@Column(name="delivery_postal_code")
	private String delivery_postal_code;
	
	@Column(name="billing_address")
	private String billing_address;
	
	@Column(name="billing_city")
	private String billing_city;
	
	@Column(name="billing_postal_code")
	private String billing_postal_code;
	
	@Column(name="customer_telephone")
	private String customer_telephone;
	
	@Column(name="customer_gender")
	private String customer_gender;
	
	
	public Customer() {
		
	}
	
	public Customer(int custId, Account account) {
		this.customer_id = custId;
		this.account = account;
	}


	public int getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDelivery_address() {
		return delivery_address;
	}


	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}


	public String getDelivery_city() {
		return delivery_city;
	}


	public void setDelivery_city(String delivery_city) {
		this.delivery_city = delivery_city;
	}


	public String getDelivery_postal_code() {
		return delivery_postal_code;
	}


	public void setDelivery_postal_code(String delivery_postal_code) {
		this.delivery_postal_code = delivery_postal_code;
	}


	public String getBilling_address() {
		return billing_address;
	}


	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}


	public String getBilling_city() {
		return billing_city;
	}


	public void setBilling_city(String billing_city) {
		this.billing_city = billing_city;
	}


	public String getBilling_postal_code() {
		return billing_postal_code;
	}


	public void setBilling_postal_code(String billing_postal_code) {
		this.billing_postal_code = billing_postal_code;
	}


	public String getCustomer_telephone() {
		return customer_telephone;
	}


	public void setCustomer_telephone(String customer_telephone) {
		this.customer_telephone = customer_telephone;
	}


	public String getCustomer_gender() {
		return customer_gender;
	}


	public void setCustomer_gender(String customer_gender) {
		this.customer_gender = customer_gender;
	}

	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	
	
	
	

}
