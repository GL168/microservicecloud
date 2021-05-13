package com.example.springcloud.service;

import com.example.springcloud.entities.Dept;

import java.util.List;

/**
 *  业务层接口
 * @author GuLin
 * @date 2021-05-13 0:30
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
