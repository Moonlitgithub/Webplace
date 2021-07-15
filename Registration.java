/**
 * @author Nitin Shashi
 *
 */
package login_Registration;

import java.io.Serializable;

public class Registration implements Serializable {
	private static final long serialVersionUID = 1 ;


	public Registration() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * JavaBean class used in jsp action tags.
	 *  
	 */

	private String firstName;
	private String lastName;
	private String username;
	private String password;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}




