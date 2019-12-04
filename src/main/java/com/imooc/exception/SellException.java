package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @author 宋德能
 * @date 2019年12月02日---下午 5:28
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}
