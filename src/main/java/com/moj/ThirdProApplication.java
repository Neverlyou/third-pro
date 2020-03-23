package com.moj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.moj.mapper")
//@EnableTransactionManagement(proxyTargetClass = true)
public class ThirdProApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdProApplication.class, args);
    }

}
