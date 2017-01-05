package com.zhangye.room.rent.server.dao;

import com.zhangye.room.rent.server.domain.User;

public interface UserDao {
	
	/**
	 * @param userId
	 * @return User
	 */
	public User selectUserById(Integer userId);  

}
