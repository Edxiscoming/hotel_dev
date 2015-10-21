package com.edison.utils;


import javax.sql.DataSource;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtil {
	
	private static DataSource dataSource=null;
	static {
		dataSource=new ComboPooledDataSource();
	}
	
	
	public static DataSource getDataSource() {
		return dataSource;
	}


	public static void setDataSource(DataSource dataSource) {
		JdbcUtil.dataSource = dataSource;
	}


	public static QueryRunner getQueryRunner(){
		return new QueryRunner(dataSource);
		
	}
}
