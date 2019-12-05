package com.imooc.service;

import com.imooc.dto.OrderDTO;
import com.imooc.pojo.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author 宋德能
 * @date 2019年12月02日---下午 2:44
 */
public interface OrderService {

    /** 1.创建订单 */
    OrderDTO create(OrderDTO orderDTO);

    /** 2.查询单个订单 */
    OrderDTO findOne(String orderId);

    /** 3.查询订单列表 */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /** 4.取消订单 */
    OrderDTO cancel(OrderDTO orderDTO);

    /** 5.完结订单 */
    OrderDTO finish(OrderDTO orderDTO);

    /** 6.支付订单 */
    OrderDTO paid(OrderDTO orderDTO);

    /** 3.查询订单列表 */
    Page<OrderDTO> findList(Pageable pageable);

}
