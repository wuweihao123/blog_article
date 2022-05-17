package com.wwh.blog.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wwh.blog.vo.ArticleVo;
import com.wwh.springcloud.uitl.Convert;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
@TableName(value = "blog_article")
@AllArgsConstructor
@NoArgsConstructor
public class Article implements Convert<ArticleVo, Article> {

    @TableId(value = "id")
    private Long id;

    /**
     * 文章标题
     */
    @TableField(value = "article_title")
    private String articleTitle;

    /**
     * 文章内容
     */
    @TableField(value = "article_content")
    private String articleContent;

    /**
     * 作者 对应 用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 文章类型
     */
    @TableField(value = "article_type_id")
    private Long articleTypeId;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    @Override
    public List<Article> vos2pos(List<ArticleVo> list) {
        List<Article> res = new ArrayList<>();
        if (!CollectionUtils.isEmpty(list)) {
            for (ArticleVo articleVo : list) {
                Article article = new Article();
                BeanUtils.copyProperties(articleVo, article);
                res.add(article);
            }
        }
        return res;
    }

    @Override
    public List<ArticleVo> pos2vos(List<Article> list) {
        List<ArticleVo> res = new ArrayList<>();
        if (!CollectionUtils.isEmpty(list)) {
            for (Article article : list) {
                ArticleVo articleVo = new ArticleVo();
                BeanUtils.copyProperties(article, articleVo);
                res.add(articleVo);
            }
        }
        return res;
    }
}
