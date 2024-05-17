package com.jskim.realworld_java.user.model.entity;

import com.jskim.realworld_java.user.model.dto.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "user")
public class EntityUser {
    @Id
    @Column(name = "email")
    private String email;
    @Column(name = "token")
    private String token;
    @Column(name = "username")
    private String username;
    @Column(name = "bio")
    private String bio;

    public User toDto(){
        return User.builder().email(email).token(token).bio(bio).username(username).build();
    }
}
