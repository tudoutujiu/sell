package com.imooc.controller;

import com.imooc.dto.OrderDTO;
import com.imooc.form.ProductForm;
import com.imooc.pojo.ProductCategory;
import com.imooc.pojo.ProductInfo;
import com.imooc.service.CategoryService;
import com.imooc.service.ProductService;
import com.imooc.util.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * 卖家端商品
 * @author 宋德能
 * @date 2019年12月07日---下午 2:35
 */
@Controller
@RequestMapping("/seller/product")
public class SellerProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService productCategory;

    /**
     * 列表
     * @param page
     * @param size
     * @param map
     * @return
     */
    @GetMapping("/list")
    public ModelAndView list(@RequestParam(value = "page",defaultValue = "1") Integer page,
                             @RequestParam(value = "size",defaultValue = "5") Integer size,
                             Map<String,Object> map){
        PageRequest request = new PageRequest(page - 1,size);
        Page<ProductInfo> productInfoPage = productService.findAll(request);
        map.put("productInfoPage",productInfoPage);
        map.put("currentPage",page);
        map.put("size",size);
        return new ModelAndView("product/list",map);
    }

    @RequestMapping("/on_sale")
    public ModelAndView onSale(@RequestParam("productId")String productId,
                               Map<String,Object> map){
        try{
            productService.onSale(productId);
            map.put("url","/sell/seller/product/list");
        }catch(SecurityException e){
            map.put("msg",e.getMessage());
            return new ModelAndView("common/error",map);
        }
        return new ModelAndView("common/success",map);
    }

    @RequestMapping("/off_sale")
    public ModelAndView offSale(@RequestParam("productId")String productId,
                               Map<String,Object> map){
        try{
            productService.offSale(productId);
            map.put("url","/sell/seller/product/list");
        }catch(SecurityException e){
            map.put("msg",e.getMessage());
            return new ModelAndView("common/error",map);
        }
        return new ModelAndView("common/success",map);
    }

    @GetMapping("/index")
    public ModelAndView index(@RequestParam(value = "productId",required = false)String productId,
                      Map<String,Object> map){
        if(!StringUtils.isEmpty(productId)){
            ProductInfo productInfo = productService.findOne(productId);
            map.put("productInfo",productInfo);
        }
        //查询所有的类目
        List<ProductCategory> categoryList = productCategory.findAll();
        map.put("categoryList",categoryList);
        return new ModelAndView("product/index",map);
    }

    /**
     * 保存和更新
     * @param productForm
     * @param bindingResult
     * @param map
     * @return
     */
    @PostMapping("/save")
    public ModelAndView save(@Valid ProductForm productForm,
                             BindingResult bindingResult,
                             Map<String,Object> map){
        if(bindingResult.hasErrors()){
            map.put("msg",bindingResult.getFieldError().getDefaultMessage());
            map.put("url","/sell/seller/product/index");
            return new ModelAndView("common/error",map);
        }

        ProductInfo productInfo = new ProductInfo();
        try{
            //如果productId不为空,说明是要执行修改操作
            if(!StringUtils.isEmpty(productForm.getProductId())){
                productInfo = productService.findOne(productForm.getProductId());
            }else {
                productForm.setProductId(KeyUtil.genUniqueKey());
            }
            BeanUtils.copyProperties(productForm,productInfo);
            productService.save(productInfo);
        }catch (SecurityException e){
            map.put("msg",e.getMessage());
            map.put("url","/sell/seller/product/index");
            return new ModelAndView("common/error",map);
        }
        map.put("url","/sell/seller/product/list");
        return new ModelAndView("common/success",map);
    }

}
