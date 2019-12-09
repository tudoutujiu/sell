package com.imooc.service;

import com.imooc.dto.CartDTO;
import com.imooc.pojo.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品
 * @author 宋德能
 * @data 2019-12-01 17:27:26
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /** 查询所有在架商品列表 */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    /**  加库存   */
    void increaseStock(List<CartDTO> cartDTOList);

    /**  加库存   */
    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
    ProductInfo onSale(String productId);

    //下架
    ProductInfo offSale(String productId);


}
