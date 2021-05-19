package com.example.springcloud.service;

import com.example.springcloud.entities.Dept;

import java.util.List;

/**
 * 业务层接口
 *
 * @author GuLin
 * @date 2021-05-13 0:30
 */
public interface IDeptService {

    /**
     * 部门新增
     *
     * @param dept: 部门
     * @Author: GuLin
     * @Date: 2021/5/16 21:55
     * @return: boolean 成功 {true} 失败{false}
     **/
    public boolean add(Dept dept);

    /**
     * 根据id查询部门
     *
     * @param id: 查询id
     * @Author: GuLin
     * @Date: 2021/5/16 21:56
     * @return: com.example.springcloud.entities.Dept 返回对象
     **/
    public Dept get(Long id);

    /**
     * 查询所有部门集合
     *
     * @Author: GuLin
     * @Date: 2021/5/16 21:56
     * @return: java.util.List<com.example.springcloud.entities.Dept> 返回部门集合
     **/
    public List<Dept> list();
}
