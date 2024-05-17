package com.jskim.realworld_java.user.interfaces;

import com.jskim.realworld_java.user.model.dto.Profile;
import com.jskim.realworld_java.user.model.dto.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ILoginService {

  User getUser(String email) throws Exception;


  Page<User> getUsers(int pageNumber, int pageSize) throws Exception;

  String loginUser(String email, String password) throws Exception;

  User addUser(User user) throws Exception;

  User updateUser(User user) throws Exception;

  Profile getProfile(String username) throws Exception;

  Profile followProfile(String username) throws Exception;

  Profile unfollowProfile(String username) throws Exception;
}
