package i.mybatis.service;

import i.mybatis.model.User;

public interface UserService {

	public User getUserById(Long userId);
	
	public User getUserByNickname(String nickname);
	
	public User getUserByUsername(String username);
}
