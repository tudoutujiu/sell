package com.imooc.service.impl;

import com.imooc.dto.OrderDTO;
import com.imooc.pojo.OrderMaster;
import com.imooc.service.OrderService;
import com.imooc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author 宋德能
 * @date 2019年12月02日---下午 5:19
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductService productService;

    @Override
    public OrderMaster create(OrderDTO orderDTO) {
        // 1.查询商品（数量，价格）

        // 2.计算总价

        // 3.写入订单数据库（OrderMaster和OrderDetail）

        // 4.扣库存
        return null;
    }

    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
