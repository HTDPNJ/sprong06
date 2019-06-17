package com.hfut.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Demo demo=ac.getBean("demo", Demo.class);
        try{
            demo.demo1("张三",23);
            demo.demo1("李四");
        }catch (Exception e){

        }
    }
}
