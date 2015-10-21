package com.edison.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.edison.dao.IFoodTypeDao;
import com.edison.entry.FoodType;
import com.edison.utils.JdbcUtil;

public class FoodTypeDao implements IFoodTypeDao {

	@Override
	public void save(FoodType foodType) {
		// TODO Auto-generated method stub
		String sql="insert into foodtype(typename) values(?)";
		QueryRunner qr=JdbcUtil.getQueryRunner();
		
		try {
			qr.update(sql, foodType.getTypeName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		
		String sql="delete from foodtype where id=?";
		try {
			JdbcUtil.getQueryRunner().update(sql, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(FoodType foodType) {
		
		String sql="update foodType set typeName=? where id=?";
		try {
			JdbcUtil.getQueryRunner().update(sql, foodType.getTypeName(),foodType.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public FoodType findById(int id) {
		String sql="select * from foodtype where id=?";
		try {
			return JdbcUtil.getQueryRunner().query(sql, new BeanHandler<FoodType>(FoodType.class), id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
		
	}

	@Override
	public List<FoodType> getAll() {	
		String sql="select * from foodtype";
		try {
			return JdbcUtil.getQueryRunner().query(sql, new BeanListHandler<FoodType>(FoodType.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public FoodType getAll(String typeName) {
		String sql="select * from foodtype where typename like ?";
		try {
			return JdbcUtil.getQueryRunner().query(sql, new BeanHandler<FoodType>(FoodType.class), "%"+typeName+"%");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
		
		
	}

}
