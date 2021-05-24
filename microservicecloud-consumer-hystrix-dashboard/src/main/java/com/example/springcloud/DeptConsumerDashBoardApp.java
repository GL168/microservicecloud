package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 1.@EnableHystrixDashboard 开启服务监控
 * 2.所有Provider微服务提供类(8001/8002/8003)都需要监控依赖配置 spring-boot-starter-actuator
 * 3.访问 http://localhost:9001/hystrix
 * @author GuLin
 * @date 16:07 2021/5/24
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerDashBoardApp {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashBoardApp.class, args);
    }

}
