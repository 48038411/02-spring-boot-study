package cn.soft1841.springboot.service.impl;

import cn.soft1841.springboot.mapper.UserMapper;
import cn.soft1841.springboot.model.User;
import cn.soft1841.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author grc
 * @Date 2019/12/23
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private UserMapper mapper;
    @Override
    public List<User> getAllUser() {
        return mapper.selectAll();
    }
}