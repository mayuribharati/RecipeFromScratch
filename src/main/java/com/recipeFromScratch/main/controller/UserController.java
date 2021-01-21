package com.recipeFromScratch.main.controller;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.recipeFromScratch.main.bean.User;
import com.recipeFromScratch.main.dao.StoreDaoImpl;
import com.recipeFromScratch.main.dao.UserDaoImpl;

@RestController
public class UserController 
{
	@Autowired
	private UserDaoImpl Udao;
	
	@Autowired
	private StoreDaoImpl Sdao;
	
	
//add requestmethod
	
@PostMapping(value="/addUser")
public @ResponseBody void addUser(@RequestBody User usr )
{
Udao.addUser(usr);
//Sdao.addStore(usr.getStore());
//System.out.println(usr.getStore());
	System.out.println(usr);
}

//getall users list  requestmethod

@GetMapping(value="/getUserAll" , produces = "Application/json" )
public ArrayList<User> getAllUser()
{

	return Udao.getAllUser();
	
}


	
	
	
	
}
