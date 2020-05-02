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
	
	@Id
	@Column(name="id")
	private int ID;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	@Column(name="account_name")
	private String accName;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	@Column(name="account_password")
	private String password;
	
	public Account() {
		
	}

	public Account(int iD, @NotNull(message = "is required") @Size(min = 1, message = "is required") String accName,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String password) {
		ID = iD;
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
		return "Account [ID=" + ID + ", accName=" + accName + ", password=" + password + "]";
	}
	
	

}
