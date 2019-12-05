package com.imooc.controller;

import com.imooc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 卖家端订单
 * @author 宋德能
 * @date 2019年12月05日---下午 4:57
 */
@Controller
@RequestMapping("/seller/order")
public class SellerOrderController {

    @Autowired
    private OrderService orderService;

    /*@GetMapping("/list")
    public ModouAndView list(@RequestParam("page") Integer page,
                             @RequestParam("size") Integer size){
        PageRequest request = new PageRequest(page - 1,size);
        Page<>
    }*/
}
