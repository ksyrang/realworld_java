package com.jskim.realworld_java.tags.controller;

import com.jskim.realworld_java.tags.model.Tags;
import com.jskim.realworld_java.tags.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tags")
public class TagsController {

    @Autowired
    private TagsService tagsService;

    @GetMapping
    private List<Tags> getTags(){
        try{
            return tagsService.getTags();
        }catch (Exception ex){
            return
        }
    }
}
