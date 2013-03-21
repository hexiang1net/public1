package hx.dao.mybatis;

import org.springframework.stereotype.Repository;

import hx.domain.mybatis.User;

@Repository
public interface UserMapper {
	
	public void insertUser(User u);
	public User getUser(String name);

}
