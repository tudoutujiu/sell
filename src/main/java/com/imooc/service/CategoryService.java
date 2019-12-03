package com.imooc.service;

import com.imooc.pojo.ProductCategory;

import java.util.List;

/**
 * 类目
 * @author 宋德能
 * @data 2019-12-01 14:10:55
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
