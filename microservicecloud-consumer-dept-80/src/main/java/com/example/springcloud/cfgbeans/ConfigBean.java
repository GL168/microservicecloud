package com.example.springcloud.cfgbeans;

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
     * @return
     */
    @Bean
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
