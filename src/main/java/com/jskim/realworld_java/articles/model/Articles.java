package com.jskim.realworld_java.articles.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


public class Articles {

    private List<Article> articles;
    private int articlesCount;

    public Articles(List<Article> articles) {
        this.articles = articles;
    }

    private void addArticle(Article article){
        articles.add(article);
    }

    private List<Article> getArticles(){
        return articles;
    }


    private int getArticlesCount(){
        return articles.size();
    }

}
