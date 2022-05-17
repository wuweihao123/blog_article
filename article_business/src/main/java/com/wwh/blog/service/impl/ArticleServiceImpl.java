package com.wwh.blog.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwh.blog.mapper.ArticleMapper;
import com.wwh.blog.mapper.ArticleTypeMapper;
import com.wwh.blog.pojo.Article;
import com.wwh.blog.pojo.ArticleCondition;
import com.wwh.blog.pojo.User;
import com.wwh.blog.service.ArticleService;
import com.wwh.blog.service.UserService;
import com.wwh.springcloud.exception.BusinessException;
import com.wwh.springcloud.uitl.BaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class ArticleServiceImpl extends BaseServiceImpl<Article> implements ArticleService {

    private final ArticleMapper articleMapper;
    private final ArticleTypeMapper articleTypeMapper;

    @DubboReference
    private UserService userService;

    public ArticleServiceImpl (ArticleMapper articleMapper,
                               ArticleTypeMapper articleTypeMapper) {
        this.articleMapper = articleMapper;
        this.articleTypeMapper = articleTypeMapper;
    }

    @Override
    public PageInfo<Article> getPage(ArticleCondition articleCondition) throws BusinessException {
        PageHelper.startPage(articleCondition.getPageNum(), articleCondition.getPageSize());
        User wwh = userService.getUser("wwh");
        log.info("wwh = {}", JSON.toJSONString(wwh));
        List<Article> articles = articleMapper.selectPageByCondition(articleCondition);
        PageInfo<Article> pageInfo = new PageInfo<>(articles);
        return pageInfo;
    }

    @Override
    public void addArticle(Article article) throws BusinessException {
        article.setUserId(123123L);
        article.setCreateTime(new Date());
        articleMapper.insert(article);
    }
}
