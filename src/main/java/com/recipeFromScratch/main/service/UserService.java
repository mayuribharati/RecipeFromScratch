package com.recipeFromScratch.main.service;

import java.util.ArrayList;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipeFromScratch.main.bean.User;
import com.recipeFromScratch.main.dao.StoreDao;
//import com.recipeFromScratch.main.dao.StoreDaoImpl;
import com.recipeFromScratch.main.dao.UserDao;

@Service
public class UserService 
{

	
	@Autowired
	private UserDao Udao;
	
	@Autowired
	private StoreDao Sdao;
	
	//add user store asciciated eith it very first login
	public void addUser(User usr)
	{
		Udao.addUser(usr);
		Sdao.addStore(usr.getStore());
		
	}
	
	//get all user
	public ArrayList<User> getAllUsers()
	{
		return Udao.GetAllUser();
	}
	
	
	//get USer by id 
	
	public Optional<User> getById(int id)
	{
		return Udao.GetById(id);
	}
	
	//Delete User by Id
	public void deleteUserById(int id)
	{
		Udao.DeleteById(id);
	}
	
	
	
	}
