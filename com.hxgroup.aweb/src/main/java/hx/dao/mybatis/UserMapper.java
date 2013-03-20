package hx.dao.mybatis;

import hx.domain.mybatis.User;

public interface UserMapper {
	
	public void insertUser(User u);
	public User getUser(String name);

}
