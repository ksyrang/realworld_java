package com.jskim.realworld_java.articles.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Author {
    private String username;
    private String bio;
    private String image;
    private boolean following;
}
