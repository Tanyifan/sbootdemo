package com.tan.sbootdemo;

/**
 * @author TanYf.
 * @project 中车-本地版本
 * @illu
 * @date 2018/11/23
 */
public class LamdaTest {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("Hello World!"));
    }
}
