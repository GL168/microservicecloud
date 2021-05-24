package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 路由网关启动类 提供=代理+路由+过滤三大功能
 * 1. @EnableZuulProxy 开启路由网关服务
 * @author GuLin
 * @date 17:18 2021/5/24
 **/
@SpringBootApplication
@EnableZuulProxy
public class Zuul9527StartSpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(Zuul9527StartSpringCloudApp.class, args);
    }

}
