package com.jskim.realworld_java.articles.controller;

import com.jskim.realworld_java.articles.model.dto.Comment;
import com.jskim.realworld_java.articles.service.CommentService;
import com.jskim.realworld_java.error.model.ErrorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/api/articles/{slug}/comments") // 이게 되려나?
public class CommentController {

    @Autowired
    private CommentService commentService;


    @PostMapping("")
    private ResponseEntity<?> addComments (@PathVariable String slug, Comment comment){
        try{
            return new ResponseEntity<>(commentService.addComments(slug,comment), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }

    @GetMapping("")
    private ResponseEntity<?> getComments(@PathVariable String slug){
        try{
            return new ResponseEntity<>(commentService.getComments(slug), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteComment(@PathVariable String slug,@PathVariable String id){
        try{
            return new ResponseEntity<>(commentService.deleteComments(slug,id), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }

}