package com.example.springcloud.service.impl;

import com.example.springcloud.dao.IDeptDao;
import com.example.springcloud.entities.Dept;
import com.example.springcloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务层实现
 *
 * @author GuLin
 * @date 2021-05-13 0:31
 */
@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private IDeptDao deptDao;

    /**
     * 部门新增
     *
     * @param dept: 部门
     * @Author: GuLin
     * @Date: 2021/5/16 21:55
     * @return: boolean 成功 {true} 失败{false}
     **/
    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    /**
     * 根据id查询部门
     *
     * @param id: 查询id
     * @Author: GuLin
     * @Date: 2021/5/16 21:56
     * @return: com.example.springcloud.entities.Dept 返回对象
     **/
    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    /**
     * 查询所有部门集合
     *
     * @Author: GuLin
     * @Date: 2021/5/16 21:56
     * @return: java.util.List<com.example.springcloud.entities.Dept> 返回部门集合
     **/
    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
