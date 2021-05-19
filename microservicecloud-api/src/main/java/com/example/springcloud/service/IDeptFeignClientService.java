package com.example.springcloud.service;

import com.example.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * feign Dept server接口
 *
 * @author GuLin
 * @date 2021-05-20 0:03
 */
@FeignClient(name = "MICROSERVICECLOUD-DEPT")
public interface IDeptFeignClientService {

    /**
     * dept 新增
     *
     * @param dept
     * @return boolean
     * @author GuLin
     * @date 0:33 2021/5/20
     **/
    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept);

    /**
     * dept根据ID查询
     *
     * @param id
     * @return com.example.springcloud.entities.Dept
     * @author GuLin
     * @date 0:33 2021/5/20
     **/
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    /**
     * dept 查询所有信息
     *
     * @return java.util.List<com.example.springcloud.entities.Dept>
     * @author GuLin
     * @date 0:33 2021/5/20
     **/
    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();


}
