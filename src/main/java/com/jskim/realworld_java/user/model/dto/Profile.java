package com.jskim.realworld_java.user.model.dto;

import com.jskim.realworld_java.user.model.entity.EntityProfile;
import com.jskim.realworld_java.user.model.entity.EntityUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
    private String username;
    private String bio;
    private String image;
    private boolean following;

    public EntityProfile toEntity(){
        return EntityProfile.builder().username(username).image(image).bio(bio).following(following).build();
    }
}
