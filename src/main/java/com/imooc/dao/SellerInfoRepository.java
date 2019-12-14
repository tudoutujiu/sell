package com.imooc.dao;

import com.imooc.pojo.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 宋德能
 * @date 2019年12月14日---下午 3:57
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo,String> {
    SellerInfo findByOpenid(String openid);
}
