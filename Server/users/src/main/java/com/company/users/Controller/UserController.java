package com.company.users.Controller;

import com.company.users.Model.User;
import com.company.users.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(method = RequestMethod.GET,value = "/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @RequestMapping(method = RequestMethod.POST,value = "/users")
    public User createUser(@RequestBody user user){
        return userService.createUser(user);
}
}