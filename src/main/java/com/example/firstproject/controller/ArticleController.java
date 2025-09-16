package com.example.firstproject.controller;

import org.springframework.web.bind.annotation.PostMapping;

public class ArticleController {
    @PostMapping("/article/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());
        //1. Convert DTO to entitiy
        Article article = form.toEntity();
        //2. Save entitiy to DB as a repository
        return "";
    }

}
