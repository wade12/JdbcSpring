package com.osgo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

import com.osgo.dao.JdbcDaoImpl;
import com.osgo.model.Circle;

public class JdbcSpring
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl dao = ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
				
		// call a method of the DAO which will fetch the data
		Circle circle = dao.getCircle(1);
		System.out.println(circle.getName());

	} // end method main

} // end Class jdbcDemo
