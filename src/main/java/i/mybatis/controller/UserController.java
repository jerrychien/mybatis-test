package i.mybatis.controller;

import i.mybatis.manager.UserManager;
import i.mybatis.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@Autowired
	UserManager userManager;
	
	@RequestMapping(value = {"/index", "/"})
	public String index() {
		return "../../index";
	}
	
	@RequestMapping("/getUserById")
	public @ResponseBody User getUserById(@RequestParam(value = "userId",required = true) Long userId) {
		return userManager.getUserById(userId);
	}
	
	
	@RequestMapping("/getUserByNickname")
	public @ResponseBody User getUserByNickname(@RequestParam(value = "nickname",required = true) String nickname) {
		return userManager.getUserByNickname(nickname);
	}
	
	@RequestMapping("/getUserByUsername")
	public @ResponseBody User getUserByUsername(@RequestParam(value = "username",required = true) String username) {
		return userManager.getUserByUsername(username);
	}
}