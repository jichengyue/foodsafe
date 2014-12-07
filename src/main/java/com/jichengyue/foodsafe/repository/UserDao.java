package com.jichengyue.foodsafe.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.jichengyue.foodsafe.pojo.User;

public interface UserDao extends PagingAndSortingRepository<User, Long>{

}
