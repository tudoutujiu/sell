package com.imooc.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 宋德能
 * @date 2019年12月05日---上午 9:23
 */
@Data
public class OrderForm {

    /**
     * 买家姓名
     */
    @NotBlank(message = "姓名必填")
    private String name;

    /**
     * 买家手机号
     */
    @NotBlank(message = "手机号必填")
    private String phone;

    /**
     * 买家地址
     */
    @NotBlank(message = "地址必填")
    private String address;

    /**
     * 买家微信openid
     */
    @NotBlank(message = "openid必填")
    private String openid;

    /**
     * 买家购物车
     */
    @NotEmpty(message = "购物车不能为空")
    private String items;

}
