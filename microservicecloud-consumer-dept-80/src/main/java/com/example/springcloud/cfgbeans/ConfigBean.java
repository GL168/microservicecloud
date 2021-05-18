package com.example.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
 * @author GuLin
 * @date 2021-05-14 22:40
 */
@Configuration
public class ConfigBean {

    /**
     * restful风格远程客户端请求方法
     * @LoadBalanced  Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


//@Bean
//public UserServcie getUserServcie()
//{
//	return new UserServcieImpl();
//}
// applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userServcie" class="com.atguigu.tmall.UserServiceImpl">
}
