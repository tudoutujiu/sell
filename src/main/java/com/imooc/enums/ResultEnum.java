package com.imooc.enums;

import lombok.Getter;

/**
 * @author 宋德能
 * @date 2019年12月02日---下午 5:30
 */
@Getter
public enum ResultEnum {

    CUCCESS(0,"成功"),

    PARAM_ERROR(1,"参数不正确"),

    PRODUCT_NOT_EXIST(10,"商品不存在"),

    PRODUCT_STOCK_ERROR(11,"商品库存不正确"),

    ORDER_NOT_EXIST(12,"订单不存在"),

    ORDERDETAIL_NOT_EXIST(13,"订单详情不存在"),

    ORDER_DETAIL_EMPTY(14,"订单详情为空"),

    ORDER_STATUS_ERROR(15,"订单状态错误"),

    ORDER_UPDATE_FAIL(16,"订单更新失败"),

    ORDER_PAY_STATUS_ERROR(17,"订单支付状态错误"),

    CART_EMPTY(18,"购物车为空"),

    ORDER_OENER_ERROR(19,"该订单不属于当前用户"),

    ORDER_CANCEL_SUCCESS(22,"订单取消成功"),

    ORDER_FINISH_SUCCESS(23,"订单完结成功"),

    PRODUCT_STATUS_ERROR(24,"商品状态错误"),
    ;
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
