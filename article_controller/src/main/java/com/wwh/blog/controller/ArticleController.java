package com.wwh.blog.controller;

import com.alibaba.fastjson2.JSON;
import com.github.pagehelper.PageInfo;
import com.wwh.blog.pojo.Article;
import com.wwh.blog.pojo.ArticleCondition;
import com.wwh.blog.service.ArticleService;
import com.wwh.blog.vo.ArticleConditionVo;
import com.wwh.blog.vo.ArticleVo;
import com.wwh.springcloud.exception.BusinessException;
import com.wwh.springcloud.pojo.ResultMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "文章模块")
@Slf4j
@RestController
@RequestMapping(value = "article")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @ApiOperation(value = "分页获取文章信息", notes = "分页获取文章信息")
    @PostMapping(value = "/getPage")
    public ResultMessage getPage(@RequestBody ArticleConditionVo articleConditionVo) throws BusinessException {
        log.info("ArticleController getPage articleConditionVo = {}", JSON.toJSONString(articleConditionVo));
        ArticleCondition articleCondition = new ArticleCondition();
        articleCondition.vo2po(articleConditionVo);
        PageInfo<Article> pageInfo = articleService.getPage(articleCondition);
        return new ResultMessage(pageInfo);
    }

    @ApiOperation(value = "新增文章", notes = "新增文章")
    @PostMapping(value = "/addArticle")
    public ResultMessage addArticle(@RequestBody ArticleVo articleVo) throws BusinessException {
        log.info("ArticleController getPage addArticle = {}", JSON.toJSONString(articleVo));
        Article article = new Article();
        article.vo2po(articleVo);
        articleService.addArticle(article);
        return new ResultMessage();
    }
}
