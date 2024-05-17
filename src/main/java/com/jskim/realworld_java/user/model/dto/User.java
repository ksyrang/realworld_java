package com.jskim.realworld_java.user.model.dto;

import com.jskim.realworld_java.user.model.entity.EntityUser;
import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String email;
    private String token;
    private String username;
    private String bio;

    public EntityUser toEntity(){
        return EntityUser.builder().email(email).token(token).bio(bio).username(username).build();
    }
}
