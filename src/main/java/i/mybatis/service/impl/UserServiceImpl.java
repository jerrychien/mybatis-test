package i.mybatis.service.impl;

import i.mybatis.dao.UserMapper;
import i.mybatis.model.User;
import i.mybatis.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserServiceImpl implements UserService {

	@Autowired(required = false)
	UserMapper userMapper;
	
	@Override
	public User getUserById(Long userId) {
		return userMapper.getUserById(userId);
	}

	@Override
	public User getUserByNickname(String nickname) {
		return userMapper.getUserByNickname(nickname);
	}

	@Override
	public User getUserByUsername(String username) {
		return userMapper.getUserByUsername(username);
	}

}
