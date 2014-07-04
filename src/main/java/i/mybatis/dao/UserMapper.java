package i.mybatis.dao;

import i.mybatis.model.User;

import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface UserMapper {

	@Select("select * from user where id = #{userId}")
	public User getUserById(Long userId);
	
	@Select("select * from user where nickname = #{nickname}")
	public User getUserByNickname(String nickname);
	
	public User getUserByUsername(String username);
}
