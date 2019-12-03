package com.imooc.dao;

import com.imooc.pojo.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 宋德能
 * @data 2019-12-01 16:53:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;
    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1234");
        productInfo.setProductName("皮蛋肉末粥");
        productInfo.setProductPrice(new BigDecimal(3.5));
        productInfo.setProductStock(12);
        productInfo.setProductDescription("味道棒极了");
        productInfo.setProductIcon("http://*******.jpg");
        productInfo.setCategoryType(2);
        productInfo.setProductStatus(0);
        ProductInfo resule = productInfoRepository.save(productInfo);
        Assert.assertNotNull(resule);
    }

    @Test
    public void findByProductStatus() {
        List<ProductInfo> list = productInfoRepository.findByProductStatus(0);
        Assert.assertNotEquals(0,list.size());
    }
}
