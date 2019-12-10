package com.imooc.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 宋德能
 * @date 2019年12月09日---下午 4:28
 */
@Data
public class ProductForm {

    private String productId;

    /** 名字 */
    private String productName;

    /** 单价 */
    private BigDecimal productPrice;

    /** 存量 */
    private Integer productStock;

    /** 描述 */
    private String productDescription;

    /** 小图 */
    private String productIcon;

    /** 类目编号 */
    private Integer categoryType;

}
