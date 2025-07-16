package com.sita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sita.domain.User;
import com.sita.usermanager.UserManager;

@RestController
public class UserController {

	private final UserManager userManager;
	 
	@Autowired  
	public UserController(UserManager userManager) {
        this.userManager = userManager;
    }
	
    @GetMapping("/hello")
    public String hello() {
        return "Hello from User Service!";
    }
    
    @GetMapping("/git")
    public String git() {
        return "CI/CD succesfully completed!!! take 6";
    }
    
    @GetMapping("/createUser")
    public String createUser(@RequestParam String name) {
    	User user = new User(name);
    	User created = userManager.createUser(user);
        return "Welcome user "+created.getUserName()+ "!!!";
    }
    
    @GetMapping("/oz")
    public String oz() {
        return "עוז המלך";
    }
    
}
