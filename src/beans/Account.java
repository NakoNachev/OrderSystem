package beans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Account {
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String accName;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String password;
	
	
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
	
	

}
