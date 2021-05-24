package com.example.springcloud.controller;

import com.example.springcloud.entities.Dept;
import com.example.springcloud.service.IDeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 控制层
 * 服务熔断
 * @author GuLin
 * @date 2021-05-13 0:37
 */
@RestController
public class DeptController {

    @Autowired
    private IDeptService deptService;


    /**
     * *@HystrixCommand 一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
     *
     * @param id
     * @return com.example.springcloud.entities.Dept
     * @author GuLin
     * @date 11:19 2021/5/24
     **/
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrixGet")
    public Dept get(@PathVariable("id") long id) {
        Dept dept = deptService.get(id);
        if(null == dept){
            throw new RuntimeException("该"+id+"未查询到部门信息");
        }
        return dept;
    }
    /**
     * 1.服务熔断方法和实际请求方法请求参数包括类型必须一致，否则会报
     *  Request processing failed; nested exception is com.netflix.hystrix.contrib.javanica.exception
     * @author GuLin
     * @date 15:36 2021/5/24
     * @param id
     * @return com.example.springcloud.entities.Dept
     **/
    public Dept processHystrixGet(@PathVariable("id") long id) {
        return new Dept().setDeptNo(id).setDeptName("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setDbSource("no this database in MySQL");
    }

}
