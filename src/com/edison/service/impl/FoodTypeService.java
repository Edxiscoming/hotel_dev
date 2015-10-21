package com.edison.service.impl;

import java.util.List;

import com.edison.dao.IFoodTypeDao;
import com.edison.dao.impl.FoodTypeDao;
import com.edison.entry.FoodType;
import com.edison.factory.BeanFactory;
import com.edison.service.IFoodTypeService;

public class FoodTypeService implements IFoodTypeService {
	IFoodTypeDao foodTypeDao=BeanFactory.getInstance("foodTypeDao", FoodTypeDao.class);
	
	@Override
	public void save(FoodType foodType) {
		// TODO Auto-generated method stub
			foodTypeDao.save(foodType);
	}

	@Override
	public void delete(int id) {
		foodTypeDao.delete(id);
	}

	@Override
	public void update(FoodType foodType) {
		foodTypeDao.update(foodType);
	}

	@Override
	public List<FoodType> getAll() {
		// TODO Auto-generated method stub
		return foodTypeDao.getAll();
	}

	@Override
	public FoodType getAll(String typeName) {
		// TODO Auto-generated method stub
		return foodTypeDao.getAll(typeName);
	}

	@Override
	public FoodType findById(int id) {
		// TODO Auto-generated method stub
		return foodTypeDao.findById(id);
	}

}
