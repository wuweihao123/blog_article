package com.wwh.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleVo {

    private String articleTitle;

    /**
     * 文章内容
     */
    private String articleContent;

    /**
     * 作者 对应 用户ID
     */
    private Long userId;

    /**
     * 文章类型
     */
    private Long articleTypeId;
}
