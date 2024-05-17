package com.jskim.realworld_java.articles.interfaces;

import com.jskim.realworld_java.articles.model.dto.Article;
import com.jskim.realworld_java.articles.model.dto.Articles;

public interface IArticlesService {
  Articles getArticles(String tag, String author, String favorited, String limit, String offset) throws Exception;

  Article getArticle(String slug)throws Exception;

  Article createArticle(Article article) throws Exception;

  Article updateArticle(String slug, Article article) throws Exception;

  Article deleteArticle(String slug) throws Exception;

  Article favoriteArticle(String slug) throws Exception;

  Article unFavoriteArticle(String slug) throws Exception;
}
