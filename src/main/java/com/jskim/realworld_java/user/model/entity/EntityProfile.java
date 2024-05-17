package com.jskim.realworld_java.user.model.entity;

import com.jskim.realworld_java.user.model.dto.Profile;
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
@Table(name = "profile")
public class EntityProfile {
    @Id
    @Column(name = "username")
    private String username;
    @Column(name = "bio")
    private String bio;
    @Column(name = "image")
    private String image;
    @Column(name = "following")
    private boolean following;

    public Profile toDto(){
        return Profile.builder().username(username).bio(bio).image(image).following(following).build();
    }
}
