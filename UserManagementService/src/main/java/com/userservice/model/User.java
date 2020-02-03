package com.userservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user_detail")
public class User implements Serializable{
	

	private static final long serialVersionUID = -1010505172625262420L;

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	protected int userId;
	
	@Column(name="first_name")
	protected String firstName;
	
	@Column(name = "middle_name")
	protected String middleName;
	
	@Column(name = "last_name")
	protected String lastName;
	
	@Column(name = "address")
	protected String address;
	
	protected String email;
	
	protected String password;

	
	public User() {
		super();
	}


	public User(int userId, String firstName, String middleName, String lastName, String address, String email,
			String password) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
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


	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", address=" + address + ", email=" + email + ", password=" + password + "]";
	}
	
}
