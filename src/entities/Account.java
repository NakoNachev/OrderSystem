package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

	@Override
	public String toString() {
		return "Account accName=" + accName + ", password=" + password + "]";
	}
	
	

}
