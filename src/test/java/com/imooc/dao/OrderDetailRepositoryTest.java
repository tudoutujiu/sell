package com.imooc.dao;

import com.imooc.pojo.OrderDetail;
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
 * @data 2019-12-02 00:39:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("45");
        orderDetail.setOrderId("123");
        orderDetail.setProductId("1234");
        orderDetail.setProductName("乌龙茶");
        orderDetail.setProductPrice(new BigDecimal(5.2));
        orderDetail.setProductIcon("http://sssss.jpg");
        orderDetail.setProductQuantity(45);
        orderDetailRepository.save(orderDetail);
        OrderDetail result = orderDetailRepository.findOne("45");
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetails = orderDetailRepository.findByOrderId("123");
        System.out.println(orderDetails);

    }
}