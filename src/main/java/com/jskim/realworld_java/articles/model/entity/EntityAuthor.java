package com.jskim.realworld_java.articles.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EntityAuthor {
    private String username;
    private String bio;
    private String image;
    private boolean following;
}
