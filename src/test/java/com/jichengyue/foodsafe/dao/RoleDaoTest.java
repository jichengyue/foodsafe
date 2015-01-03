package com.jichengyue.foodsafe.dao;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.collections.IteratorUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jichengyue.foodsafe.pojo.Role;
import com.jichengyue.foodsafe.repository.RoleDao;


@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/spring/spring-root.xml"})
public class RoleDaoTest {
	
	@Autowired
	private RoleDao roleDao;
	
	@Test
	public void testRoleFind(){
		Iterable<Role> roles =  roleDao.findAll();
		log.info(IteratorUtils.toList(roles.iterator())+"");
	}

}
