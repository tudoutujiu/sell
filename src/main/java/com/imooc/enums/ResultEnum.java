package com.imooc.enums;

import lombok.Getter;

/**
 * @author 宋德能
 * @date 2019年12月02日---下午 5:30
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(10,"商品不存在"),
    PRODUCT_STOCK_ERROR(11,"商品库存不足"),
    ORDER_NOT_EXIST(12,"订单不存在"),
    ORDERDETAIL_NOT_EXIST(13,"订单详情不存在"),
    ORDER_DETAIL_EMPTY(14,"订单详情为空"),
    ORDER_STATUS_ERROR(15,"订单状态错误"),
    ORDER_UPDATE_FAIL(16,"订单更新失败"),
    ;
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
