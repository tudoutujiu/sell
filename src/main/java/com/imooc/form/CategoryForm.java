package com.imooc.form;

import lombok.Data;

/**
 * @author 宋德能
 * @date 2019年12月14日---下午 1:58
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

}
