package com.example.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.springcloud.entities.Dept;

/**
 * dao 层
 * @author GuLin
 * @date 0:43 2021/5/13
 **/
@Mapper
public interface DeptDao
{
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
