package com.zhangye.room.rent.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangye.room.rent.server.dao.UserDao;
import com.zhangye.room.rent.server.domain.User;

@Service  
public class UserServiceImpl implements UserService {

	@Autowired  
    private UserDao userDao;  
  
    public User selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  
          
    }  
}
