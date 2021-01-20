package com.recipeFromScratch.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.recipeFromScratch.main.bean.Recipe;
import com.recipeFromScratch.main.service.RecipeService;

@RestController
public class RecipeController {
	@Autowired  
	RecipeService recipeService;

	@GetMapping("/getAllrecipe")
	public @ResponseBody List<Recipe> getAllRecipe(){
		return recipeService.getAllRecipe();
		
	}
	
	@PostMapping("/add")
	public @ResponseBody int addRecipe(@RequestBody Recipe recipe)
	{
		return recipeService.addRecipe(recipe);
		
	}
	
	 
}
