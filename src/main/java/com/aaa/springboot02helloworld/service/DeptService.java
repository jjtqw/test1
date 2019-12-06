package com.aaa.springboot02helloworld.service;

import com.aaa.springboot02helloworld.dao.DeptDAO;
import com.aaa.springboot02helloworld.entity.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptService {

    @Resource
    DeptDAO deptDAO;

    public List<Dept> query(){
        return deptDAO.selectAll();
    }

    public int add(Dept dept){
        return deptDAO.insert(dept);
    }

    public int update(Dept dept){
        return deptDAO.updateByPrimaryKey(dept);
    }

    public int del(Integer id){
        return deptDAO.deleteByPrimaryKey(id);
    }
}
