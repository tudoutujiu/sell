package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 买家
 * @author 宋德能
 * @date 2019年12月05日---下午 3:15
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消一个订单
    OrderDTO cancelOrder(String openid,String orderId);
}
