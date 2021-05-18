package com.example.springcloud.controller;

import com.example.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 远程调用8001服务
 *
 * @author GuLin
 * @date 2021-05-14 22:44
 */
@RestController
public class DeptControllerConsumer {

    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    /** eureka服务地址 Ribbon和Eureka整合后Consumer可以直接调用服务而不用再关心地址和端口号 **/
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    /**
     * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。
     * (url, requestMap,ResponseBean.class)
     * 这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {

        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") long id) {

        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {

        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery() {
      return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery",Object.class);
    }


}
