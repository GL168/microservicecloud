package com.example.springcloud.dao;

import com.example.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * dao 层
 *
 * @author GuLin
 * @date 0:43 2021/5/13
 **/
@Mapper
public interface IDeptDao {
    /**
     * 部门新增
     *
     * @param dept: 部门
     * @Author: GuLin
     * @Date: 2021/5/16 21:55
     * @return: boolean 成功 {true} 失败{false}
     **/
    public boolean addDept(Dept dept);

    /**
     * 根据id查询部门
     *
     * @param id: 查询id
     * @Author: GuLin
     * @Date: 2021/5/16 21:56
     * @return: com.example.springcloud.entities.Dept 返回对象
     **/
    public Dept findById(Long id);

    /**
     * 查询所有部门集合
     *
     * @Author: GuLin
     * @Date: 2021/5/16 21:56
     * @return: java.util.List<com.example.springcloud.entities.Dept> 返回部门集合
     **/
    public List<Dept> findAll();
}
