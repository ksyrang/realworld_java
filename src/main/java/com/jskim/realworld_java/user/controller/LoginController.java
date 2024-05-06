package com.jskim.realworld_java.user.controller;

import com.jskim.realworld_java.user.model.Profile;
import com.jskim.realworld_java.user.model.User;
import com.jskim.realworld_java.user.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/api/users/login")
    private String loginUser(String email, String password){
        try{
            return loginService.loginUser(user);
        }catch (Exception ex){
            return
        }
    }

    @PostMapping("/api/users")
    private User addUser(User user){
        try{
            return loginService.addUser(user);
        }catch (Exception ex){
            return
        }
    }

    @GetMapping("/api/user")
    private User getUser (String email){
        try{
            return loginService.getUser(email);
        }catch (Exception ex){
            return
        }
    }

    @PutMapping("/api/user")
    private User updateUser(User user){
        try{
            return loginService.updateUser(user);
        }catch (Exception ex){
            return
        }
    }

    @GetMapping("/api/profiles/{username}")
    private Profile getProfile (@PathVariable String username){
        try{
            return loginService.getProfile(username);
        }catch (Exception ex){
            return
        }
    }

    @PostMapping("/api/profiles/{username}/follow")
    private Profile followProfile (@PathVariable String username){
        try{
            return loginService.followProfile(username);
        }catch (Exception ex){
            return
        }
    }
    @DeleteMapping("/api/profiles/{username}/follow")
    private Profile unfollowProfile (@PathVariable String username){
        try{
            return loginService.unfollowProfile(username);
        }catch (Exception ex){
            return
        }
    }

}
