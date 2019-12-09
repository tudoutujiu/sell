package com.imooc.service.impl;

import com.imooc.enums.ProductStatusEnum;
import com.imooc.pojo.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 宋德能
 * @data 2019-12-01 17:49:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo = productService.findOne("1234");
        Assert.assertEquals("1234",productInfo.getProductId());
    }

    @Test
    public void findUpAll() throws Exception{
        List<ProductInfo> productInfoList = productService.findUpAll();
        System.out.println(productInfoList.size());
        Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findAll() throws Exception{
        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> productInfoPage = productService.findAll(request);
        System.out.println(productInfoPage.getTotalElements());
    }

    @Test
    public void save() throws Exception{
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("12345");
        productInfo.setProductName("乌龙茶");
        productInfo.setProductPrice(new BigDecimal(3.5));
        productInfo.setProductStock(12);
        productInfo.setProductDescription("味道棒极了");
        productInfo.setProductIcon("http://*******.jpg");
        productInfo.setCategoryType(2);
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        ProductInfo resule = productService.save(productInfo);
    }

    @Test
    public void onSale(){
        ProductInfo result = productService.onSale("12345");
        Assert.assertEquals(ProductStatusEnum.UP,result.getProductStatusEnum());
    }

    @Test
    public void offSale(){
        ProductInfo result = productService.offSale("1234");
        Assert.assertEquals(ProductStatusEnum.DOWN,result.getProductStatusEnum());
    }
}