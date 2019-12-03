package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品(包含类目)
 * @author 宋德能
 * @data 2019-12-01 18:59:43
 */
@Data
public class ProductVO {

    /** JsonProperty注解可将变量名传回前端的时候使用括号里面设置的名字*/
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer crtegoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;


}
