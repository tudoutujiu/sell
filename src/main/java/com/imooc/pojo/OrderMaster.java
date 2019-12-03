package com.imooc.pojo;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 买家订单
 * @author 宋德能
 * @data 2019-12-01 23:50:43
 */
@Data
@Entity
@NoArgsConstructor
@DynamicUpdate
public class OrderMaster {

    @Id
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
    private Integer orderStatus= OrderStatusEnum.NEW.getCode();

    /** 支付状态,默认0是等待支付 */
    private Integer payStatus= PayStatusEnum.WAIT.getCode();

    /** 创建时间 */
    private Date createTime;

    /** 修改时间 */
    private Date updateTime;




}
