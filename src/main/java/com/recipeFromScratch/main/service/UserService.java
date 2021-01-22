package com.recipeFromScratch.main.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.recipeFromScratch.main.bean.User;
import com.recipeFromScratch.main.dao.StoreDaoImpl;
import com.recipeFromScratch.main.dao.UserDaoImpl;

public class UserService 
{

	
	@Autowired
	private UserDaoImpl Udao;
	
	@Autowired
	private StoreDaoImpl Sdao;
	
	//add user store asciciated eith it very first login
	public void addUser(User usr)
	{
		Udao.addUser(usr);
		Sdao.addStore(usr.getStore());
		
	}
	
	//get all user
	public ArrayList<User> getAllUsers()
	{
		return Udao.getAllUser();
	}
	
	
	//get USer by id 
	
	public Optional<User> getById(int id)
	{
		return Udao.getById(id);
	}
	
	//Delete User by Id
	public void deleteUserById(int id)
	{
		Udao.deleteById(id);
	}
	
	
	
	
}
