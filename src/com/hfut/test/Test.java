package com.hfut.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Demo demo=ac.getBean("demo", Demo.class);
        try{
            demo.demo1();
        }catch (Exception e){

        }
    }
}
