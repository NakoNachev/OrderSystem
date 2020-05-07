package entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="accounts")
public class Account {
	
	
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	@Id
	@Column(name="acc_name")
	private String accName;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	@Column(name="acc_password")
	private String password;
	
	// when we delete customerID, we dont have to delete account as well
	// two scenarios:
	// for each customerID - one account
	// for each order - customerID
	// first option seems more intuitive, but will see
	@OneToOne(mappedBy="account", cascade = {CascadeType.DETACH,CascadeType.MERGE,
			CascadeType.PERSIST,CascadeType.REFRESH})
	private Customer customer;
	
	public Account() {
		
	}

	public Account(String accName, String password) {
		
		this.accName = accName;
		this.password = password;
	}

	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Account accName=" + accName + ", password=" + password + "]";
	}
	
	

}
