package com.recipeFromScratch.main.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Table
@Entity

public class Recipe {
	@Id
	@GeneratedValue
	@Column  
	private int recipeId ;
	@Column  
	private String recipeType ;
	@Column  
	private String recipeName  ;
	@ElementCollection
	private List<String> ingredientsList = new ArrayList<String>();
	@Column  
	private int categoryId ; 
	@Column  
	private int timeRequired;
	@Column  
	private String image ;
	@Column  
	private String steps ;
	@Column  
	private int userId ;

	public Recipe()
	{
		
	}
	public Recipe(int recipeId, String recipeType, String recipeName, List<String> ingredientsList, int categoryId,
			int timeRequired, String image, String steps, int userId) {
		super();
		this.recipeId = recipeId;
		this.recipeType = recipeType;
		this.recipeName = recipeName;
		this.ingredientsList = ingredientsList;
		this.categoryId = categoryId;
		this.timeRequired = timeRequired;
		this.image = image;
		this.steps = steps;
		this.userId = userId;
	}
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	public String getRecipeType() {
		return recipeType;
	}
	public void setRecipeType(String recipeType) {
		this.recipeType = recipeType;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public List<String> getIngredientsList() {
		return ingredientsList;
	}
	public void setIngredientsList(List<String> ingredientsList) {
		this.ingredientsList = ingredientsList;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getTimeRequired() {
		return timeRequired;
	}
	public void setTimeRequired(int timeRequired) {
		this.timeRequired = timeRequired;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSteps() {
		return steps;
	}
	public void setSteps(String steps) {
		this.steps = steps;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Recipe [recipeId=" + recipeId + ", recipeType=" + recipeType + ", recipeName=" + recipeName
				+ ", ingredientsList=" + ingredientsList + ", categoryId=" + categoryId + ", timeRequired="
				+ timeRequired + ", image=" + image + ", steps=" + steps + ", userId=" + userId + "]";
	}
	
	
}
