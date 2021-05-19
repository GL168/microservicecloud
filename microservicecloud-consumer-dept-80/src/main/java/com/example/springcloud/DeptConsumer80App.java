package com.example.springcloud;

import com.example.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 80消费者启动类
 * 采用 Ribbon+RestTemplate 访问
 * *@EnableEurekaClient 本服务启动后自动注册进入eureka服务中
 * *@RibbonClient 在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
 * @author GuLin
 * @date 2021/5/16
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer80App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80App.class, args);
    }

}
