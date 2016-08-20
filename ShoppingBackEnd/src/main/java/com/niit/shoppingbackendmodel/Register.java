package com.niit.shoppingbackendmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Register")
@Component
public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@NotNull
	@Size(min = 2, max = 30, message = "Name Must be more than 2 letters")
	@Column(name = "name")
	private String name;
	@NotNull
	@Size(min = 2, max = 30)
	@Column(name = "password")
	private String password;

	@NotNull
	@Size(min = 2, max = 30)
	@Column(name = "confirm_password")

	private String confirm_password;

	@NotNull
	@Size(min = 2, max = 30)
	@Column(name = "email")
	private String email;
	@NotNull
	@Size(min = 2, max = 30, message = "Address at least more than 3 Characters")
	@Column(name = "address")
	private String address;
	@NotNull
	@Size(min = 10, max = 12)
	@Column(name = "mobile")
	private String mobile;
		
	@Column(name = "status")
	private boolean  status=false;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}


