 package mypackage;

import java.io.Serializable;

public class ptuser implements Serializable {

   private static final long serialVersionUID = -2547245654057778522L;
   
   private String username="";
   
   private String password="";
  
   private String type="";
	
	public void setUsername(String username) {
		this.username = username; 
	}

	public void setPassword(String password) {
		this.password = password; 
	}

	public String getUsername() {
		return (this.username); 
	}

	public String getPassword() {
		return (this.password); 
	}

	
	public void setType(String type) {
		this.type = type; 
	}

	public String getType() {
		return (this.type); 
	}
    
}