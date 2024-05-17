package com.jskim.realworld_java.tags.service;

import com.jskim.realworld_java.tags.interfaces.ITagsService;
import com.jskim.realworld_java.tags.model.Tags;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagsService implements ITagsService {
  @Override
  public List<Tags> getTags() throws Exception {
    return null;
  }
}
