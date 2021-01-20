package com.recipeFromScratch.main.bean;

public class Store 
{

	private int store_id;
	private String store_name;
	private String store_address;
	private int pincode;
	private int User_id;
	private String contact_no;
	
	public Store() {
		super();
	}

	public Store(int store_id, String store_name, String store_address, int pincode, int user_id, String contact_no) {
		super();
		this.store_id = store_id;
		this.store_name = store_name;
		this.store_address = store_address;
		this.pincode = pincode;
		User_id = user_id;
		this.contact_no = contact_no;
	}

	@Override
	public String toString() {
		return "Store [store_id=" + store_id + ", store_name=" + store_name + ", store_address=" + store_address
				+ ", pincode=" + pincode + ", User_id=" + User_id + ", contact_no=" + contact_no + "]";
	}

	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}

	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public String getStore_address() {
		return store_address;
	}

	public void setStore_address(String store_address) {
		this.store_address = store_address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int user_id) {
		User_id = user_id;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	
	
	
	
	
	
	
	
	
	
	
}
