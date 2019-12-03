package com.imooc.dao;

import com.imooc.pojo.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


/**
 * @author 宋德能
 * @date 2019年11月30日---下午 2:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;
    @Test
    public void FindOneTest(){
       ProductCategory productCategory = repository.findOne(2);
       productCategory.setCategoryType(15);
       repository.save(productCategory);
        //System.out.println(productCategory);
        //System.out.println(productCategory.toString());
    }
    @Test
    //@Transactional    测试结果可以看到，但不会放入数据到库里面（完全回滚）
    public void saveTest(){
        ProductCategory productCategory = repository.findOne(2);
        productCategory.setCategoryType(23);
        repository.save(productCategory);
        /*
        //这里断言会失败，原因是数据库有一个唯一约束
        ProductCategory productCategory = new ProductCategory("女神最爱",2);
        ProductCategory resource = repository.save(productCategory);
        //断言他不是空的
        Assert.assertNotNull(resource);*/
    }
    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(1,2,3);
        List<ProductCategory> resource = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,resource.size());
    }
}