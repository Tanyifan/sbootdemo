package com.tan.sbootdemo.dao;

import com.tan.sbootdemo.entity.Classes;
import com.tan.sbootdemo.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/17
 */
@Mapper
public interface ClassMapper{
    public List<Classes> getT(int id);
}
