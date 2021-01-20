package com.recipeFromScratch.main.bean;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	
	public User()
	{
		super();
	}



	public User(int user_Id, String firstName, String lastName, String email, String phone, String password,
			String type) {
		super();
		User_Id = user_Id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Phone = phone;
		Password = password;
		Type = type;
	}



	@Override
	public String toString() {
		return "User [User_Id=" + User_Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", Phone=" + Phone + ", Password=" + Password + ", Type=" + Type + "]";
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
	
	









}
