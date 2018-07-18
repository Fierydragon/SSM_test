package com.chen.li.mybatis;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chen.li.pojo.NextTestBean;
import com.chen.li.service.NextTestService;

public class NextTestMapperTest {
	@Autowired
	public static NextTestService nextTestService;
	
	@BeforeClass
	public static void init() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:mybatisTest.xml");//这里路径之前没有配对于是一直出错
		nextTestService = (NextTestService)context.getBean("nextTestService");
		
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAdd() {
		NextTestBean bean = new NextTestBean();
		bean.setName("LiChen");
		bean.setAge(29);
		bean.setPhoneNumber("17366371161");
	}
}
