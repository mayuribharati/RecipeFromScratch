package com.recipeFromScratch.main.dao;

import org.springframework.data.repository.CrudRepository;

import com.recipeFromScratch.main.bean.Recipe;


public interface  RecipeDaoImplimentation   extends CrudRepository<Recipe,Integer> {

}
