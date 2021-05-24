package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * hystrix 启动类
 *  1.@EnableEurekaClient 本服务启动后自动注册进入eureka服务中
 *  2.@EnableDiscoveryClient 服务发现
 *  3.@EnableCircuitBreaker 对hystrixR熔断机制的支持
 * @author GuLin
 * @date 11:26 2021/5/24
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
public class DeptProvider8001HystrixApp {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001HystrixApp.class, args);
    }

}
