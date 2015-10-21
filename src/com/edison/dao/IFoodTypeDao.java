package com.edison.dao;

import java.util.List;

import com.edison.entry.FoodType;


/**
 * 菜系操作接口
 * ClassName: IFoodTypeDao
 * @Description: TODO
 * @author Administrator
 * @date 2015年10月21日
 */
public interface IFoodTypeDao {
	//保存
	public void save(FoodType foodType);
	
	/*
	 * 根据id删除
	 */
	public void delete(int id);
	
	//更新
	public void update(FoodType foodType);
	
	//主键查询
	public FoodType findById(int id);
	
	//查询全部
	public List<FoodType> getAll();
	
	//根据菜系名称查询
	public FoodType getAll(String typeName);
	
}
