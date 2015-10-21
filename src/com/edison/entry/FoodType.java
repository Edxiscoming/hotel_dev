package com.edison.entry;
/**
 * 菜系表实体
 * ClassName: FoodType
 * @Description: TODO
 * @author Administrator
 * @date 2015年10月21日
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
