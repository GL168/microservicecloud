package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *  服务提供者8002
 *  1.@EnableEurekaClient 本服务启动后自动注册进入eureka服务中
 *  2.@EnableDiscoveryClient 服务发现
 * @author GuLin
 * @date 2021-05-13 0:42
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8002App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002App.class, args);
    }

}
