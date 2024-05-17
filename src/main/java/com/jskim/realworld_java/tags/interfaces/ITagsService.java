package com.jskim.realworld_java.tags.interfaces;

import com.jskim.realworld_java.tags.model.Tags;

import java.util.List;

public interface ITagsService {
  List<Tags> getTags()throws Exception;
}
