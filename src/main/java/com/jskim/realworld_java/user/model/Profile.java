package com.jskim.realworld_java.user.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Profile {
    private String username;
    private String bio;
    private String image;
    private boolean following;
}
