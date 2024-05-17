package com.jskim.realworld_java.articles.interfaces;

import com.jskim.realworld_java.articles.model.dto.Comment;

import java.util.List;

public interface ICommentService {
  Comment addComments(String slug, Comment comment) throws Exception;

  List<Comment> getComments(String slug) throws Exception;

  Comment deleteComments(String slug, String id) throws Exception;
}
