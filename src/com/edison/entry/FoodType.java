package com.edison.entry;
/**
 * ��ϵ��ʵ��
 * ClassName: FoodType
 * @Description: TODO
 * @author Administrator
 * @date 2015��10��21��
 */
public class FoodType {
	
	private int id;
	
	private String typeName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "FoodType [id=" + id + ", typeName=" + typeName + "]";
	}
	
}
