package com.edison.service;

import java.util.List;

import com.edison.entry.FoodType;

public interface IFoodTypeService {
	public void save(FoodType foodType);
	
	public void delete(int id);
	
	public void update(FoodType foodType);
	
	public List<FoodType> getAll();
	
	public FoodType getAll(String typeName);
	
	public FoodType findById(int id);
}
