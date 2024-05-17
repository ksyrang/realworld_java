package com.jskim.realworld_java.user.repository;

import com.jskim.realworld_java.user.model.entity.EntityProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<EntityProfile,String> {
  EntityProfile getUerByUsername(String username);
}
