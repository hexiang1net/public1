package hx.controller;

import java.util.List;

import hx.domain.jpa.User;
import hx.service.imp.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user.do")
public class UserController {
	
	
	private UserServiceImpl userService;

	
	@RequestMapping
	public String getAllUser(ModelMap modelMap){
		List<User> list  = userService.getAllUser();
		modelMap.put("list", list);
		modelMap.put("shit", " you b");
		return "allUser";
	}
	
	
	//shit
	public UserServiceImpl getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}

}
