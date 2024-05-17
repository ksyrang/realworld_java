package com.jskim.realworld_java.articles.service;

import com.jskim.realworld_java.articles.interfaces.IArticlesService;
import com.jskim.realworld_java.articles.model.dto.Article;
import com.jskim.realworld_java.articles.model.dto.Articles;
import org.springframework.stereotype.Service;

@Service
public class ArticlesService implements IArticlesService {
  @Override
  public Articles getArticles(String tag, String author, String favorited, String limit, String offset) throws Exception {
    return null;
  }

  @Override
  public Article getArticle(String slug) throws Exception {
    return null;
  }

  @Override
  public Article createArticle(Article article) throws Exception {
    return null;
  }

  @Override
  public Article updateArticle(String slug, Article article) throws Exception {
    return null;
  }

  @Override
  public Article deleteArticle(String slug) throws Exception {
    return null;
  }

  @Override
  public Article favoriteArticle(String slug) throws Exception {
    return null;
  }

  @Override
  public Article unFavoriteArticle(String slug) throws Exception {
    return null;
  }
}
