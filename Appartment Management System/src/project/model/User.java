package project.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class User {
	private String email;
	private String password;
	private String name;
	private String phoneNumber;
	
	public User(String email, String password, String name, String phoneNumber) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
