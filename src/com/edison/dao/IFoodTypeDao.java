package com.edison.dao;

import java.util.List;

import com.edison.entry.FoodType;


/**
 * ��ϵ�����ӿ�
 * ClassName: IFoodTypeDao
 * @Description: TODO
 * @author Administrator
 * @date 2015��10��21��
 */
public interface IFoodTypeDao {
	//����
	public void save(FoodType foodType);
	
	/*
	 * ����idɾ��
	 */
	public void delete(int id);
	
	//����
	public void update(FoodType foodType);
	
	//������ѯ
	public FoodType findById(int id);
	
	//��ѯȫ��
	public List<FoodType> getAll();
	
	//���ݲ�ϵ���Ʋ�ѯ
	public FoodType getAll(String typeName);
	
}
