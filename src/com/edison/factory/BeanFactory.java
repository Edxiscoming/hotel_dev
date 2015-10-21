package com.edison.factory;

import java.util.ResourceBundle;

/**
 * ����������dao��service��ʵ��
 * ClassName: BeanFactory
 * @Description: TODO
 * @author Administrator
 * @date 2015��10��21��
 */
public class BeanFactory {

	//��ȡ�����ļ�
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
