package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 80消费者启动类
 * @EnableEurekaClient 本服务启动后自动注册进入eureka服务中
 * @author GuLin
 * @date 2021/5/16
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80App.class, args);
    }

}
