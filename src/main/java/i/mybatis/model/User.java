package i.mybatis.model;

import org.apache.ibatis.type.Alias;

import com.zongheng.core.model.BaseObject;

/**
 * 用户基础对象
 * @author tianbenzhen
 *
 */
@Alias("user")
public class User extends BaseObject{

	private static final long serialVersionUID = 594337868159876093L;
	
	private Long id;
	private String username;
	private String nickname;
	private String email;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
