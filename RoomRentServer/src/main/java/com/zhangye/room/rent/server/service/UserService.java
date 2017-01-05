package com.zhangye.room.rent.server.service;

import com.zhangye.room.rent.server.domain.User;

public interface UserService {
	User selectUserById(Integer userId);  
}
