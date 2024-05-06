package com.jskim.realworld_java.user.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@Data
public class User {
    private String email;
    private String token;
    private String username;
    private String bio;
}
