package com.imooc.dto;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import com.imooc.pojo.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author 宋德能
 * @date 2019年12月02日---下午 5:08
 */
@Data
public class OrderDTO {
    /** 订单编号 */
    private String orderId;

    /** 买家名字 */
    private String buyerName;

    /** 买家电话 */
    private String buyerPhone;

    /** 买家地址 */
    private String buyerAddress;

    /** 买家微信opentid */
    private String buyerOpenid;

    /** 订单总金额 */
    private BigDecimal orderAmount;

    /** 订单状态 默认0是新订单 */
    private Integer orderStatus;

    /** 支付状态,默认0是等待支付 */
    private Integer payStatus;

    /** 创建时间 */
    private Date createTime;

    /** 修改时间 */
    private Date updateTime;


    private List<OrderDetail> orderDetailList;

}
