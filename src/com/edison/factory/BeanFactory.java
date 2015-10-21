package com.edison.factory;

import java.util.ResourceBundle;

/**
 * 工厂：创建dao和service的实例
 * ClassName: BeanFactory
 * @Description: TODO
 * @author Administrator
 * @date 2015年10月21日
 */
public class BeanFactory {

	//读取配置文件
	private static ResourceBundle bundle;
	static {
		bundle=ResourceBundle.getBundle("instance");
	}
	
	
	public static <T> T getInstance(String key,Class<T> clazz){
		String className=bundle.getString(key);
		try {
			return (T)Class.forName(className).newInstance();
		} catch (Exception e) {
			throw new RuntimeException();
		} 
		
		
	}
	
	
}
