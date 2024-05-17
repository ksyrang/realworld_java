package com.jskim.realworld_java.articles.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EntityComment {
    private int id;
    private String createdAt;
    private String updatedAt;
    private String body;
    private EntityAuthor entityAuthor;
}
