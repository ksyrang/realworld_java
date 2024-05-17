package com.jskim.realworld_java.articles.controller;

import com.jskim.realworld_java.articles.model.dto.Articles;
import com.jskim.realworld_java.articles.service.ArticlesService;
import com.jskim.realworld_java.articles.model.dto.Article;
import com.jskim.realworld_java.error.model.ErrorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/api/articles")
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;

    @GetMapping("")
    private ResponseEntity<?> getArticles( // favorited의 의미는?
            @RequestParam String tag, @RequestParam String author,@RequestParam String favorited,
            @RequestParam String limit,@RequestParam String offset){
        try{
            return new ResponseEntity<>(articlesService.getArticles(tag,author,favorited,limit,offset), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }

    @GetMapping("/feed") // 인증이 필요한 기사를 받는다?, 최근 기사부터
    private ResponseEntity<?> getFeedArticles(
            @RequestParam String tag, @RequestParam String author,@RequestParam String favorited,
            @RequestParam String limit,@RequestParam String offset){
        try{
            return new ResponseEntity<>(articlesService.getArticles(tag,author,favorited,limit,offset), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }
    @GetMapping("/{slug}")
    private ResponseEntity<?> getArticle(@PathVariable String slug){
        try{
            return new ResponseEntity<>(articlesService.getArticle(slug), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }

    @PostMapping("")
    private ResponseEntity<?> createArticle(Article article){
        try{
            return new ResponseEntity<>(articlesService.createArticle(article), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }

    @PutMapping("/{slug}")
    private ResponseEntity<?> updateArticle(@PathVariable String slug,Article article){
        try{
            return new ResponseEntity<>(articlesService.updateArticle(slug,article), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }

    @DeleteMapping("/{slug}") //인증된 사용자인걸 어찌 알까?
    private ResponseEntity<?> deleteArticle(@PathVariable String slug){
        try{
            return new ResponseEntity<>(articlesService.deleteArticle(slug), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }

    @PostMapping("/{slug}/favorite")
    private ResponseEntity<?> favoriteArticle(@PathVariable String slug){
        try{
            return new ResponseEntity<>(articlesService.favoriteArticle(slug), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }

    @DeleteMapping("/{slug}/favorite")
    private ResponseEntity<?> unFavoriteArticle(@PathVariable String slug){
        try{
            return new ResponseEntity<>(articlesService.unFavoriteArticle(slug), HttpStatus.OK);
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setBody(ex.getMessage());
            return status(500).body(errorResponse.getBody());
        }
    }

}
