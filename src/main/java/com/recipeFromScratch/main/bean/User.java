package com.recipeFromScratch.main.bean;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Table
@Entity
public class User
{
	@Id
	@GeneratedValue
	@Column
	private int User_Id;
	@Column
	private String FirstName;
	@Column
	private String LastName;
	@Column
	private String Email;
	@Column
	private String Phone;
	@Column
	private String Password;
	@Column
	private String Type;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="store_id")
	private Store store;
	
	/*@OneToOne
	@JoinColumn(name="aid")
	Address addr;
	*/
	
	
	
	
	
	
	
	public User()
	{
		super();
	}

	public User(int user_Id, String firstName, String lastName, String email, String phone, String password,
			String type, Store store) {
		super();
		User_Id = user_Id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Phone = phone;
		Password = password;
		Type = type;
		this.store = store;
	}

	public int getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	@Override
	public String toString() {
		return "User [User_Id=" + User_Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", Phone=" + Phone + ", Password=" + Password + ", Type=" + Type + ", store=" + store + "]";
	}








}
