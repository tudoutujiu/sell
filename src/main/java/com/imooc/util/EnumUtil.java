package com.imooc.util;

import com.imooc.enums.CodeEnum;

/**
 * @author 宋德能
 * @date 2019年12月06日---上午 11:40
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code , Class<T> enumClass){
        for(T each:enumClass.getEnumConstants()){
            if(code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }

}
