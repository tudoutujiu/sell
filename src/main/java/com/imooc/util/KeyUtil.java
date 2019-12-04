package com.imooc.util;

import java.util.Random;

/**
 * @author 宋德能
 * @date 2019年12月04日---上午 10:55
 */
public class KeyUtil {
    /**
     * @生成唯一的主键
     * 格式：时间+随机数
     * synchronized:（多线程相关）防止返回的随机字符串出现重复
     * return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis()+String.valueOf(number);
    }
}
