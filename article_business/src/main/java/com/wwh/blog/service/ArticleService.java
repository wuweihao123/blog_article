package com.wwh.blog.service;

import com.github.pagehelper.PageInfo;
import com.wwh.blog.pojo.Article;
import com.wwh.blog.pojo.ArticleCondition;
import com.wwh.springcloud.exception.BusinessException;

public interface ArticleService {
    PageInfo<Article> getPage(ArticleCondition articleCondition) throws BusinessException;

    void addArticle(Article article) throws BusinessException;
}
