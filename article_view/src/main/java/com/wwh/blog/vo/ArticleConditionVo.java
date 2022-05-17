package com.wwh.blog.vo;

import com.wwh.springcloud.vo.PageConditionVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleConditionVo extends PageConditionVo {

    private Integer articleType;

    private Long userId;
}
