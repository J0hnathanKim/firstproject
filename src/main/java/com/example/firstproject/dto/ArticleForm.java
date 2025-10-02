package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private String title; // title field
    private String content; // content field


    //Method that verifies the data has been completely transferred


    public Article toEntity() {
        return new Article(null, title, content);
    }
}
