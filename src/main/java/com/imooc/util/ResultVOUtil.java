package com.imooc.util;

import com.imooc.VO.ResultVO;
import com.imooc.enums.ProductStatusEnum;

/**
 * @author 宋德能
 * @data 2019-12-01 23:29:37
 */
public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(ProductStatusEnum.UP.getCode());
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO success(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;

    }
}
