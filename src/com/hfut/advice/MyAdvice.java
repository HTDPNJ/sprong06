package com.hfut.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
    public void mybefore(){
        System.out.println("前置");
    }
    public void myafter(){
        System.out.println("后置");
    }
    public void myaftering(){
        System.out.println("后置2");
    }
    public void mythrow(){
        System.out.println("异常");
    }
    public Object myarround(ProceedingJoinPoint p)throws Throwable{
        System.out.println("执行环绕");
        System.out.println("环绕-前置");
        Object result=p.proceed();
        System.out.println("环绕-后置");
        return result;
    }
}
