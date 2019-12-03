package com.imooc.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author 宋德能
 * @data 2019-12-01 17:38:05
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"上架"),
    DOWN(1,"下架")
    ;
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message = message;
    }


}
