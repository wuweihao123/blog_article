package com.wwh.blog.pojo;

import com.wwh.blog.vo.ArticleConditionVo;
import com.wwh.springcloud.uitl.Convert;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;


import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleCondition implements Convert<ArticleConditionVo, ArticleCondition> {

    private Long userId;

    private Integer articleType;

    private Integer pageSize;

    private Integer pageNum;

    @Override
    public void vo2po(ArticleConditionVo articleConditionVo) {
        if (!Objects.isNull(articleConditionVo)) {
            BeanUtils.copyProperties(articleConditionVo, this);
        }
    }

    @Override
    public ArticleConditionVo po2vo() {
        ArticleConditionVo articleConditionVo = new ArticleConditionVo();
        BeanUtils.copyProperties(this, articleConditionVo);
        return articleConditionVo;
    }
}
