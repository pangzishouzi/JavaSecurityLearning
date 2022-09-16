package com.drunkbaby;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.drunkbaby.mapper")
public class JavaSecCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSecCodeApplication.class, args);
    }

}