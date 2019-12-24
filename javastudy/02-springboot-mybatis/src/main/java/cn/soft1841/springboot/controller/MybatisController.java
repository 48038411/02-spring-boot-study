package cn.soft1841.springboot.controller;

import cn.soft1841.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MybatisController
 * @Description TODO
 * @Author grc
 * @Date 2019/12/23
 **/
@RestController
public class MybatisController {
    @Autowired
    private StudentService service;
    @GetMapping("/boot/students")
    public Object students(){
        return service.getAllUser();
    }

    @RequestMapping("/hello")
    public  String hello(){
        return "hello world";
    }
}