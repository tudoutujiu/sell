package com.imooc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 宋德能
 * @date 2019年12月04日---上午 11:17
 */
@Data
@AllArgsConstructor
public class CartDTO {
    /** 商品id. */
    private String productId;

    /** 商品数量 */
    private Integer productQuantity;
}
