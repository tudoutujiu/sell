package com.imooc.enums;

/**
 * @author 宋德能
 * @date 2019年12月02日---下午 5:30
 */
public enum ResultEnum {

    ;
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
