package com.recipeFromScratch.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.recipeFromScratch.main.bean.User;
import com.recipeFromScratch.main.dao.UserDaoImpl;

@RestController
public class UserController 
{
	@Autowired
	private UserDaoImpl Udao;
	
@PostMapping("/addUser")
public void addUser(@RequestBody User u )
{

	Udao.addUser(u);
	
}
	
	
	
	
	
	
}
