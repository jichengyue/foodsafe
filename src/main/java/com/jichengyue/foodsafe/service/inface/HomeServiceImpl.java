package com.jichengyue.foodsafe.service.inface;

import java.util.List;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jichengyue.foodsafe.pojo.User;
import com.jichengyue.foodsafe.repository.UserDao;
import com.jichengyue.foodsafe.service.impl.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	private UserDao userDao;
	
	public List<User> getAllUser() {
		return IteratorUtils.toList(userDao.findAll().iterator());
	}

}
