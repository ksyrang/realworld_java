package com.jskim.realworld_java.articles.service;

import com.jskim.realworld_java.articles.interfaces.ICommentService;
import com.jskim.realworld_java.articles.model.dto.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService implements ICommentService {
  @Override
  public Comment addComments(String slug, Comment comment) throws Exception {
    return null;
  }

  @Override
  public List<Comment> getComments(String slug) throws Exception {
    return null;
  }

  @Override
  public Comment deleteComments(String slug, String id) throws Exception {
    return null;
  }
}
