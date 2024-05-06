package com.jskim.realworld_java.articles.controller;

import com.jskim.realworld_java.articles.model.Articles;
import com.jskim.realworld_java.articles.service.ArticlesService;
import com.jskim.realworld_java.articles.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;

    @GetMapping("")
    private Articles getArticles( // favorited의 의미는?
            @RequestParam String tag, @RequestParam String author,@RequestParam String favorited,
            @RequestParam String limit,@RequestParam String offset){
        try{
            return articlesService.getArticles(tag,author,favorited,limit,offset);
        }catch (Exception ex){
            return
        }
    }

    @GetMapping("/feed") // 인증이 필요한 기사를 받는다?, 최근 기사부터
    private Articles getFeedArticles(
            @RequestParam String tag, @RequestParam String author,@RequestParam String favorited,
            @RequestParam String limit,@RequestParam String offset){
        try{
            return articlesService.getArticles(tag,author,favorited,limit,offset);
        }catch (Exception ex){
            return
        }
    }
    @GetMapping("/{slug}")
    private Article getArticle(@PathVariable String slug){
        try{
            return articlesService.getArticle(slug);
        }catch (Exception ex){
            return
        }
    }

    @PostMapping("")
    private Article createArticle(Article article){
        try{
            return articlesService.createArticle(article);
        }catch (Exception ex){
            return
        }
    }

    @PutMapping("/{slug}")
    private Article updateArticle(@PathVariable String slug,Article article){
        try{
            return articlesService.updateArticle(slug,article);
        }catch (Exception ex){
            return
        }
    }

    @DeleteMapping("/{slug}") //인증된 사용자인걸 어찌 알까?
    private Article deleteArticle(@PathVariable String slug){
        try{
            return articlesService.deleteArticle(slug);
        }catch (Exception ex){
            return
        }
    }

    @PostMapping("/{slug}/favorite")
    private Article favoriteArticle(@PathVariable String slug){
        try{
            return articlesService.favoriteArticle(slug);
        }catch (Exception ex){
            return
        }
    }

    @DeleteMapping("/{slug}/favorite")
    private Article unFavoriteArticle(@PathVariable String slug){
        try{
            return articlesService.unFavoriteArticle(slug);
        }catch (Exception ex){
            return
        }
    }

}
