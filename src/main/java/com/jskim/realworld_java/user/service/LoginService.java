package com.jskim.realworld_java.user.service;

import com.jskim.realworld_java.user.interfaces.ILoginService;
import com.jskim.realworld_java.user.model.dto.Profile;
import com.jskim.realworld_java.user.model.dto.User;
import com.jskim.realworld_java.user.model.entity.EntityProfile;
import com.jskim.realworld_java.user.model.entity.EntityUser;
import com.jskim.realworld_java.user.repository.ProfileRepository;
import com.jskim.realworld_java.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService implements ILoginService {


  @Autowired
  private UserRepository userRepository;

  @Autowired
  private ProfileRepository profileRepository;

  @Override
  public User getUser(String email) throws Exception {
    EntityUser entityUser = userRepository.getUserByEmail(email);
    return entityUser.toDto();
  }

  @Override
  public Page<User> getUsers(int pageNumber, int pageSize) throws Exception {
    PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
    Page<User> result = Optional.of(userRepository.findAll(pageRequest))
        .orElse(Page.empty()).map(entityUser -> entityUser.toDto());
    return result;
  }

  @Override
  public String loginUser(String email, String password) throws Exception {
    return null;
  }

  @Override
  public User addUser(User user) throws Exception {
    userRepository.save(user.toEntity());
    return user;
  }

  @Override
  public User updateUser(User user) throws Exception {
    userRepository.save(user.toEntity());
    return user;
  }

  @Override
  public Profile getProfile(String username) throws Exception {
    EntityProfile entityProfile = profileRepository.getUerByUsername(username);
    return entityProfile.toDto();
  }

  @Override
  public Profile followProfile(String username) throws Exception {
    EntityProfile entityProfile = profileRepository.getUerByUsername(username);
    entityProfile.setFollowing(true);
    profileRepository.save(entityProfile);
    return entityProfile.toDto();
  }

  @Override
  public Profile unfollowProfile(String username) throws Exception {
    EntityProfile entityProfile = profileRepository.getUerByUsername(username);
    entityProfile.setFollowing(false);
    profileRepository.save(entityProfile);
    return entityProfile.toDto();
  }
}
