package com.kaishengit.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	
	private static SqlSessionFactory sessionFactory = builderSessionFactory();

	
	
	
	private static SqlSessionFactory builderSessionFactory() {
		try {
			Reader reader=Resources.getResourceAsReader("mybatis.xml");
			
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			
			
			return sqlSessionFactoryBuilder.build(reader);
		} catch (IOException e) {
			throw new RuntimeException("∂¡»°¥ÌŒÛ",e);		}
	}
	
	
	public static SqlSessionFactory getSqlSessionFactory(){
		return sessionFactory;
		
	}
	
	public static SqlSession getSqlSession() {
		return getSqlSessionFactory().openSession();
	}
	
	
}
	



