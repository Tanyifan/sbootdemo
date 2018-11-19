package com.tan.sbootdemo.service;

import com.tan.sbootdemo.dao.ClassMapper;
import com.tan.sbootdemo.entity.Classes;
import com.tan.sbootdemo.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/17
 */
@Service
public class TClass implements ClassImpl{
    @Autowired
    private ClassMapper classMapper;
    @Override
    public List<Classes> getT(int id) {
        return classMapper.getT(id);
    }
}
