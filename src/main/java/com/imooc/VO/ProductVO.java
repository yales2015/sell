package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by yy on 2017/9/4.
 */
@Data
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private String CategoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
