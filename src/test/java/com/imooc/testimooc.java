package com.imooc;


import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class testimooc {

    @Test
    public void test1(){
        String name = "宋德能";
        String password = "123456";
        log.debug("debug:宋德能");
        log.info("info:土逗");
        log.error("error:name:{},password:{}",name,password);
    }

}
