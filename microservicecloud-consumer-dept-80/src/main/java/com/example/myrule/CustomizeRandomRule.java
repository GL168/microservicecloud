package com.example.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 自定义每个服务轮询五次算法
 *
 * @author GuLin
 * @date 2021-05-19 22:58
 */
public class CustomizeRandomRule extends AbstractLoadBalancerRule {

    /**
     * 初始化参数
     */
    private int initializeNum = 0;
    /**
     * 总共被调用的次数，目前要求每台被调用5次
     */
    private int total = 0;
    /**
     * 当前提供服务的机器号
     */
    private int currentIndex = 0;
    /**
     * 最大调用次数
     */
    private int maxTotal = 5;

    /**
     * Randomly choose from all living servers
     */
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            List<Server> upList = lb.getReachableServers();
            List<Server> allList = lb.getAllServers();

            int serverCount = allList.size();
            if (serverCount == initializeNum) {
                /*
                 * No servers. End regardless of pass, because subsequent passes
                 * only get more restrictive.
                 */
                return null;
            }
            //随机获取服务
            //int index = chooseRandomInt(serverCount);
            //小于5次 默认使用第一台
            if (total < maxTotal) {
                //累计每次调用次数
                total++;
                server = upList.get(currentIndex);
            } else {
                //大于5次初始化total 并且设置第二台服务
                total = initializeNum;
                currentIndex++;
                if (currentIndex >= allList.size()) {
                    currentIndex = initializeNum;
                }
            }

            if (server == null) {
                /*
                 * The only time this should happen is if the server list were
                 * somehow trimmed. This is a transient condition. Retry after
                 * yielding.
                 */
                Thread.yield();
                continue;
            }

            if (server.isAlive()) {
                return (server);
            }

            // Shouldn't actually happen.. but must be transient or a bug.
            server = null;
            Thread.yield();
        }

        return server;

    }

    protected int chooseRandomInt(int serverCount) {
        return ThreadLocalRandom.current().nextInt(serverCount);
    }

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }
}