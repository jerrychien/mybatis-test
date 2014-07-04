package i.mybatis.manager;

import i.mybatis.model.User;
import i.mybatis.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManager {

	@Autowired
	UserService userService;
	
	public User getUserById(Long userId) {
		return userService.getUserById(userId);
	}
	
	public User getUserByNickname(String nickname) {
		return userService.getUserByNickname(nickname);
	}
	
	public User getUserByUsername(String username) {
		return userService.getUserByUsername(username);
	}
}
