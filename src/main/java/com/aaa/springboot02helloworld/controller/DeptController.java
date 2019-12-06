package com.aaa.springboot02helloworld.controller;

import com.aaa.springboot02helloworld.entity.Dept;
import com.aaa.springboot02helloworld.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class DeptController {

    @Resource
    DeptService deptService;

    @RequestMapping("")
    public String a(){
        return "dept";
    }
    @RequestMapping("/query")
    @ResponseBody
    public List<Dept> query(){
        return deptService.query();
    }

    @RequestMapping("/del")
    @ResponseBody
    public int del(Integer id){
        return deptService.del(id);
    }
}
