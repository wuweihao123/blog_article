package com.wwh.blog.pojo;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@TableName(value = "blog_article_type")
@AllArgsConstructor
@NoArgsConstructor
public class ArticleType {

    @TableId(value = "id")
    private Long id;

    /**
     * 文章类型
     */
    @TableField(value = "article_type")
    private Integer type;

    /**
     * 文章类型备注
     */
    @TableField(value = "article_notes")
    private String notes;

    /**
     * 创建用户名
     */
    @TableField(value = "create_user")
    private String createUser;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新用户名
     */
    @TableField(value = "update_user")
    private String updateUser;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;
}
