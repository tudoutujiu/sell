package com.imooc.VO;

import lombok.Data;

/**
 * http返回的最外层对象
 * @author 宋德能
 * @data 2019-12-01 18:22:19
 */
@Data
public class ResultVO<T> {

    /** 错误码code */
    private Integer code;

    /** 提示信息 */
    private String msg;

    /** 具体内容 */
    private T data;

}
