package com.jskim.realworld_java.articles.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Comment {
    private int id;
    private String createdAt;
    private String updatedAt;
    private String body;
    private Author author;
}
