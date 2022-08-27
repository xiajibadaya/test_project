package com.example.elmspring.controller;
import com.example.elmspring.model.user;
import com.example.elmspring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
@Autowired
    IUserService userService;

 @RequestMapping("/login")
 public user login(@RequestBody user user){
     user u=userService.login(user);
     u.setPassword("");
     System.out.println(user.getUserId());
     return u;
 }
}
