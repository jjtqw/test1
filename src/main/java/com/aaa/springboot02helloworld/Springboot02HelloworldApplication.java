package com.aaa.springboot02helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.aaa.springboot02helloworld.dao")
public class Springboot02HelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02HelloworldApplication.class, args);
    }

}
