package com.recipeFromScratch.main.controller;

import java.util.ArrayList;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.recipeFromScratch.main.bean.User;
//import com.recipeFromScratch.main.dao.StoreDaoImpl;
import com.recipeFromScratch.main.dao.UserDao;
import com.recipeFromScratch.main.service.UserService;




@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserController 
{
	@Autowired
	private UserService Uservice;
//add requestmethod
	
@PostMapping(value="/addUser")
public @ResponseBody void addUser(@RequestBody User usr )
{

	Uservice.addUser(usr);
	System.out.println(usr);


}


//getall users list  requestmethod

@GetMapping(value="/getUserAll" , produces = "Application/json" )
public ArrayList<User> getAllUser()
{

	return Uservice.getAllUsers();
	
}

@DeleteMapping("deleteUser/{id}")
public void deleteUser(@PathVariable ("id") int id)
{

	 Optional<User> u =Uservice.getById(id);
	 
	 User usr = u.get();
	 Uservice.deleteUserById(usr.getUser_Id());

	//get by id and edit
	

}
	
	
	
	
}
