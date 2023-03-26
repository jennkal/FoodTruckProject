package com.skilldistillery.foodtruck.entities;

import java.util.Arrays;

//create many food trucks, blueprint.
public class FoodTruck {

	private String name;
	private String foodType;
	private int rating;
	private int nameID;
	private static int count;

	// constructors
	public FoodTruck(String name, String foodType, int rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		
		//increase Id
		count++;
		nameID = count;
		
	}
	
	//no args constructor
	public FoodTruck() {
		
	}

@Override
	public String toString() {
		return "FoodTruck [name = " + name + ", foodType = " + foodType + ", rating = " + rating + "]";
	}

	// get and set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
