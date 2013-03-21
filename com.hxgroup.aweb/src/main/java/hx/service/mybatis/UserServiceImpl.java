package hx.service.mybatis;

import hx.dao.mybatis.UserMapper;
import hx.domain.mybatis.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService02")
public class UserServiceImpl {
	
	@Autowired
	private UserMapper userMapper;
	
	
	
	public User getUser(String name){
		return userMapper.getUser(name);
	}
	
	
	
	
	

}
