package com.example.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
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

    /**
     * ribbon 算法
     * （1）RoundRobinRule：轮询；
     * （2）RandomRule：随机；
     * （3）AvailabilityFilteringRule：会先过滤掉由于多次访问故障而处于断路器状态的服务，还有并发的连接数量超过阈值的服务，
     *     然后对剩余的服务列表按照轮询策略进行访问；
     * （4）WeightedResponseTimeRule：根据平均响应时间计算所有服务的权重，响应时间越快的服务权重越大被选中的概率越大。
     *     刚启动时如果统计信息不足，则使用RoundRobinRule（轮询）策略，等统计信息足够，会切换到WeightedResponseTimeRule；
     * （5）RetryRule：先按照RoundRobinRule（轮询）策略获取服务，如果获取服务失败则在指定时间内进行重试，获取可用的服务；
     * （6）BestAvailableRule：会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，然后选择一个并发量最小的服务；
     * （7）ZoneAvoidanceRule：复合判断Server所在区域的性能和Server的可用性选择服务器；
     * @return
     */
    @Bean
    public IRule myRule(){
       return new RetryRule();
    }


//@Bean
//public UserServcie getUserServcie()
//{
//	return new UserServcieImpl();
//}
// applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userServcie" class="com.atguigu.tmall.UserServiceImpl">
}
