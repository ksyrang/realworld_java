package com.jskim.realworld_java.user.controller;

import com.jskim.realworld_java.error.model.ErrorResponse;
import com.jskim.realworld_java.user.model.dto.Profile;
import com.jskim.realworld_java.user.model.dto.User;
import com.jskim.realworld_java.user.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.status;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/api/users/login")
    private ResponseEntity<?> loginUser(String email, String password){
        try{
            return new ResponseEntity<>(loginService.loginUser(email,password), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(401).body(errorResponse.getBody());
        }
    }

    @PostMapping("/api/users")
    private ResponseEntity<?> addUser(User user){
        try{
            return new ResponseEntity<>(loginService.addUser(user), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }

    @GetMapping("/api/user")
    private ResponseEntity<?> getUser (String email){
        try{
            return new ResponseEntity<>(loginService.getUser(email), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }

    @PutMapping("/api/user")
    private ResponseEntity<?> updateUser(User user){
        try{
            return new ResponseEntity<>(loginService.updateUser(user), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }

    @GetMapping("/api/profiles/{username}")
    private ResponseEntity<?> getProfile (@PathVariable String username){
        try{
            return new ResponseEntity<>(loginService.getProfile(username), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }

    @PostMapping("/api/profiles/{username}/follow")
    private ResponseEntity<?> followProfile (@PathVariable String username){
        try{
            return new ResponseEntity<>(loginService.followProfile(username), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }
    @DeleteMapping("/api/profiles/{username}/follow")
    private ResponseEntity<?> unfollowProfile (@PathVariable String username){
        try{
            return new ResponseEntity<>(loginService.unfollowProfile(username), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }
}
