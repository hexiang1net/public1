package hx.dao.imp;

import hx.domain.jpa.User;
import hx.dto.UserDto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository("UserDao01")
public class UserDaoImpl {
	
	@Autowired
	private HibernateTemplate template;

	
	
	public void addUser(UserDto user){
		
		User u = new User();
		u.setAddress(user.getAddress());
		u.setAge(user.getAge());
		u.setEmail(user.getEmail());
		u.setName(user.getName());
		u.setPhone(user.getPhone());
		
		template.save(u);
	}
	
	public List<User> getAllUser(){
		return template.find("from User");
	}
	
	
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	

}
