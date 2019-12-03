package com.imooc.enums;

import lombok.Getter;

/**
 * @author 宋德能
 * @data 2019-12-01 23:57:11
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"创建新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消")
    ;
    private Integer code;
    private String msg;
    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
