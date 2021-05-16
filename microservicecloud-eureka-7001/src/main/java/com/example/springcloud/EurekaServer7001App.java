package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eurekaServer 服务
 * 1.@EnableEurekaServer 服务启动类，接受其他服务注册进来
 * @author GuLin
 * @create 2021-05-16 21:22
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001App.class,args);
    }
}
