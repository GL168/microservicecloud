package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 80feign消费者启动类
 * 采用服务接口+注解方式调用
 *  *@EnableFeignClients 开启自动注册到feign服务中
 *  *@EnableEurekaClient 本服务启动后自动注册进入eureka服务中
 * @author GuLin
 * @date 23:56 2021/5/19
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.example.springcloud"})
@ComponentScan("com.example.springcloud")
public class DeptConsumer80FeignApp {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80FeignApp.class, args);
    }

}
