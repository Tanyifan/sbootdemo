package com.tan.sbootdemo.controller;

import com.tan.sbootdemo.entity.Classes;
import com.tan.sbootdemo.entity.Teacher;
import com.tan.sbootdemo.service.TClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/17
 */
@RestController
public class ClassController {
    @Autowired
    private TClass tClass;

    @RequestMapping("/testM")
    public ModelAndView get(){
        List<Classes> list = tClass.getT(1);
        System.out.println(list.get(0).getName());
        return new ModelAndView("testM","c",list.get(0));
    }

}
