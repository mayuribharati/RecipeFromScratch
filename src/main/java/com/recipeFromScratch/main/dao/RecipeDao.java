package com.recipeFromScratch.main.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import com.recipeFromScratch.main.bean.Ingredient;
import com.recipeFromScratch.main.bean.Recipe;
@Repository
public class RecipeDao {

	@Autowired
	private RecipeDaoImplimentation recipeRepository;
	
	@Autowired
	//private IngredientDaoImplemetation ingredienRepository;
	
	public List<Recipe> getAllRecipe() {
		// TODO Auto-generated method stub
		return (List<Recipe>) recipeRepository.findAll();
	}

	public Recipe addRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
//		List<Ingredient> ingredients = recipe.getIngredientsList();
//		for (Ingredient ig : ingredients) {
//			ingredienRepository.save(ig);
//		}
		return  recipeRepository.save(recipe);
	}

}
