package com.imooc.controller;

import com.imooc.VO.ProductInfoVO;
import com.imooc.VO.ProductVO;
import com.imooc.VO.ResultVO;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.pojo.ProductCategory;
import com.imooc.pojo.ProductInfo;
import com.imooc.service.CategoryService;
import com.imooc.service.ProductService;
import com.imooc.util.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 买家商品
 * @author 宋德能
 * @data 2019-12-01 18:13:10
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/list")
    public ResultVO list(){
        //1.查询所有的上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();
        //2.查询类目(一次性查询)
        //List<Integer> categoryTypeList = new ArrayList<>();
        //传统方法
       /*
       for(ProductInfo productInfo:productInfoList){
            categoryTypeList.add(productInfo.getCategoryType());
        }*/
       //精简方法(java8,lambda)
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());
       List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);
        //3.数据拼装
        List<ProductVO> productVOList = new ArrayList<>();
        for(ProductCategory productCategory:productCategoryList){
            ProductVO productVO = new ProductVO();
            productVO.setCrtegoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());
            //遍历商品详情
            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for(ProductInfo productInfo:productInfoList){
                if(productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    //将productInfo的值拷贝到productInfoVO
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
                productVO.setProductInfoVOList(productInfoVOList);
                productVOList.add(productVO);
            }
        }
        return ResultVOUtil.success(productCategoryList);
    }

}
