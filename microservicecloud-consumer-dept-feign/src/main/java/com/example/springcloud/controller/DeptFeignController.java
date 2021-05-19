package com.example.springcloud.controller;

import com.example.springcloud.entities.Dept;
import com.example.springcloud.service.IDeptFeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * feign 控制层
 * @author GuLin
 * @date 2021-05-20 0:07
 */
@RestController
public class DeptFeignController {

    @Autowired
    private IDeptFeignClientService deptFeignClientService;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {

        return this.deptFeignClientService.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") long id) {

        return this.deptFeignClientService.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {

        return this.deptFeignClientService.list();
    }

}
