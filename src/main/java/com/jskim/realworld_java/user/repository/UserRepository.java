package com.jskim.realworld_java.user.repository;


import com.jskim.realworld_java.user.model.entity.EntityUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<EntityUser,String > {

    EntityUser getUserByEmail(String email);

    Page<EntityUser> getFindAllUser(Pageable pageable);

}
