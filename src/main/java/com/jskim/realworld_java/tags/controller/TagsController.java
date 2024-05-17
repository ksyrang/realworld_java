package com.jskim.realworld_java.tags.controller;

import com.jskim.realworld_java.articles.model.dto.Comment;
import com.jskim.realworld_java.error.model.ErrorResponse;
import com.jskim.realworld_java.tags.model.Tags;
import com.jskim.realworld_java.tags.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/api/tags")
public class TagsController {

    @Autowired
    private TagsService tagsService;

    @GetMapping
    private ResponseEntity<?> getTags(){
        try{
            return new ResponseEntity<>(tagsService.getTags(), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }
}