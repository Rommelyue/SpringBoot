package com.zkr.Controller;

import com.zkr.Pojo.User;
import com.zkr.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;








@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
//	@RequestMapping("/find")
//	public UserResult find(){
//		return userService.find();
//	}


	@RequestMapping("/findById/{id}")
	public User findById(@PathVariable Integer id){
		return userService.findById(id);
	}
}
