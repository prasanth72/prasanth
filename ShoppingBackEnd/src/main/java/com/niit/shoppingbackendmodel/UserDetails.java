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
@Table(name="UserDetails")
@Component
public class UserDetails
{
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="id")
    private int id;	
	 
	 @NotNull
	 @Size(min=2,max=30,message="Name Must be more than 2 letters")
	 @Column(name="name")
    private String name;
	 
	@Column (name="admin", columnDefinition="tinyint default 0 ")
	private boolean admin;

	public boolean getAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	@NotNull
	 @Size(min=2,max=30)
	 @Column(name="password")
 
	private String password;
	private String confirm_password;
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
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

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	 public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	@NotNull
	 @Size(min=2,max=30)
	@Column(name = "email")
	private String email;
	 @NotNull
	 @Size(min=2,max=30,message="Address at least more than 3 Characters")
	 @Column(name="address")	
	private String address;
	 @NotNull
	 @Size(min=10,max=12)
	 @Column(name="mobile")
	
	private String mobile;

	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}
}
