package com.tan.sbootdemo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author TanYf.
 * @project 中车-本地版本
 * @illu
 * @date 2018/11/23
 */
public class FunctionInterfaceTest{
    @Test
    public void testLamda(){
        func((x)-> System.out.println("Hello World!"+x));
        int count;
        List<Map<String,Object>> list = new ArrayList();
        Map<String,Object> map = new HashMap<>(8);
        list.add(map);
        //遍历方法
        count = (int) list.stream().filter((m -> map.get("city").equals("123"))).count();
        System.out.println(count);
    }
    private void func(FunctionInterface functionInterface){
        int x= 1;
        functionInterface.test(x);
    }
}
