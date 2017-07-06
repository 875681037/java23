package com.kaishengit.mybaits;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kaishengit.entity.User;
import com.kaishengit.util.MyBatisUtil;

public class MyBtaisTest {
	private Logger logger = LoggerFactory.getLogger(MyBtaisTest.class);
	
	@Test
	public void first() throws Exception{
		Reader reader = Resources.getResourceAsReader("mybatis.xml");
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
		
		SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(reader);
		
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		User user = (User) sqlSession.selectOne("com.kaishengit.mapper.UserMapper.findById", 1);
		
		System.out.println(user.getUserName());
		System.out.println(user.getAddress());
		
		sqlSession.close();
		
		
	}
	@Test
	public void findAll() throws Exception{
		SqlSession sqlSession= MyBatisUtil.getSqlSession();
		List<User> userList=sqlSession.selectList("com.kaishengit.mapper.UserMapper.findAll");
		for(User user:userList){
			
			logger.debug("{} -> {} -> {}",user.getId(),user.getUserName(),user.getAddress());
			
		}
		sqlSession.close();
		
	}
	@Test
	public void save() throws IOException{
		Reader reader = Resources.getResourceAsReader("mybatis.xml");
		
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder= new SqlSessionFactoryBuilder();
		
		SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(reader);
		
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		User user = new User();
		user.setAddress("湖北");
		user.setUserName("王思");
		user.setPassword("123456");
		
		sqlSession.insert("com.kaishengit.mapper.UserMapper.save",user);
		sqlSession.commit();
		sqlSession.close();
	}
		
	
		@Test
		public void update() throws IOException{
			Reader reader = Resources.getResourceAsReader("mybatis.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(reader);
			
			SqlSession sqlSession=sqlSessionFactory.openSession();
			
			User user= (User) sqlSession.selectOne("com.kaishengit.mapper.UserMapper.findById", 2);
			
			user.setAddress("重庆");
			sqlSession.update("com.kaishengit.mapper.UserMapper.update",user);
		
			sqlSession.commit();
			sqlSession.close();
			
		}
		
		
		public void delete() throws IOException{
			Reader reader = Resources.getResourceAsReader("mybatis.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(reader);
			
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.delete("com.kaishengit.mapper.UserMapper.delById",3);
			
			sqlSession.commit();
			sqlSession.close();
			
		}
		
			
			
			
			
			
}
