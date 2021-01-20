package com.recipeFromScratch.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipeFromScratch.main.bean.Recipe;
import com.recipeFromScratch.main.dao.RecipeDao;
@Service
public class RecipeService {
	@Autowired
	RecipeDao recipeDao;

	public List<Recipe> getAllRecipe() {
		// TODO Auto-generated method stub
		
		return recipeDao.getAllRecipe();
	}

	public int addRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		
		return recipeDao.addRecipe(recipe).getRecipeId();
	}
	

}
