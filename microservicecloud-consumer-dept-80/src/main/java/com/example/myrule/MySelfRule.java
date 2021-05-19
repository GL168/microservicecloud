package com.example.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义ribbon负载均衡算法策略
 * 1.自定义ribbon策略不能和@ComponentScan处在同包下，也就是80主启动类
 *
 * @author GuLin
 * @date 2021-05-19 22:30
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        // Ribbon默认是轮询，我自定义为随机
        //return new RandomRule();
        //自定义算法策略 每台每次轮询五次
        return new CustomizeRandomRule();
    }
}
