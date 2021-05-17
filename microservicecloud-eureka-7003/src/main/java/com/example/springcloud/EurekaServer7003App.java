package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eurekaServer 7003 服务
 * 1.@EnableEurekaServer 服务启动类，接受其他服务注册进来
 * @author GuLin
 * @create 2021-05-17 22:55
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003App.class,args);
    }
}
