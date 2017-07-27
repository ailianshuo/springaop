package com.ailianshuo.springaop.sample03;

import org.springframework.stereotype.Component;

@Component("strUtil")
public class StrUtil {
    public void show(){
        System.out.println("Hello StrUtil!");
    }
    @MyAnno
    public void showAnno(){
        System.out.println("Hello MyAnno StrUtil!");
    }
}