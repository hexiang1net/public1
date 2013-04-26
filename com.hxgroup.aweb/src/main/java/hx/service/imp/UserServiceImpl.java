package hx.service.imp;

import hx.dao.imp.UserDaoImpl;
import hx.domain.jpa.User;
import hx.dto.UserDto;
import hx.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("UserService01")
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	@Qualifier("UserDao01")
	private UserDaoImpl userDao;
	
	
	
	public void addUser(UserDto user){
		userDao.addUser(user);
	}
	
	
	public List<User> getAllUser(){
		System.out.println(" userservice imp getAllUser ");
		return null;
//		return userDao.getAllUser();
	}
	
	
	

	public UserDaoImpl getUserDao() {
		return userDao;
	}
	
	
	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}

}
