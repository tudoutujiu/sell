package com.imooc.service;

import com.imooc.pojo.SellerInfo;

/**
 * @author 宋德能
 * @date 2019年12月14日---下午 4:06
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
