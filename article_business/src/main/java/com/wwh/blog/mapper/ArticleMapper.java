package com.wwh.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wwh.blog.pojo.Article;
import com.wwh.blog.pojo.ArticleCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

    List<Article> selectPageByCondition(ArticleCondition articleCondition);
}
