package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticleForm {
    private String title; // title field
    private String content; // content field

    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    //Method that verifies the data has been completely transferred
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(null, title, content);
    }
}
