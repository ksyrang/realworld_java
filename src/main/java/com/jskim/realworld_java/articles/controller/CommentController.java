package com.jskim.realworld_java.articles.controller;

import com.jskim.realworld_java.articles.model.Comment;
import com.jskim.realworld_java.articles.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articles/{slug}/comments") // 이게 되려나?
public class CommentController {

    @Autowired
    private CommentService commentService;


    @PostMapping("")
    private Comment addComments (@PathVariable String slug, Comment comment){
        try{
            return commentService.addComments(slug,comment);
        }catch (Exception ex){
            return
        }
    }

    @GetMapping("")
    private List<Comment> getComments(@PathVariable String slug){
        try{
            return commentService.getComments(slug);
        }catch (Exception ex){
            return
        }
    }

    @DeleteMapping("/{id}")
    private Comment deleteComment(@PathVariable String slug,@PathVariable String id){
        try{
            return commentService.getComments(slug,id);
        }catch (Exception ex){
            return
        }
    }
}
