package com.jskim.realworld_java.articles.model.entity;

import java.util.List;


public class EntityArticles {

    private List<EntityArticle> entityArticles;
    private int articlesCount;

    public EntityArticles(List<EntityArticle> entityArticles) {
        this.entityArticles = entityArticles;
    }

    private void addArticle(EntityArticle entityArticle){
        entityArticles.add(entityArticle);
    }

    private List<EntityArticle> getArticles(){
        return entityArticles;
    }


    private int getArticlesCount(){
        return entityArticles.size();
    }

}
