package com.jichengyue.foodsafe.dao;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.jichengyue.foodsafe.pojo.User;
import com.jichengyue.foodsafe.repository.UserDao;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/spring/spring-root.xml"})
public class UserDaoTest {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void testUserRoles(){
		User user = userDao.findByUserName("ºæ≥Ã‘æ");
		System.out.println(user.getUserRoles());
		log.info(user.getUserRoles()+"");
	}
	
	/*@Test
	public void testUserFind(){
		Iterable<User> users = userDao.findAll();
		List<User> list = IteratorUtils.toList(users.iterator());
		log.info("=================== \n"+list.get(0));
	}*/
}
