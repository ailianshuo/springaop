package com.ailianshuo.springaop.sample04;

import org.springframework.stereotype.Component;

@Component("strUtil")
public class StrUtil {
    public void show(){
        System.out.println("Hello StrUtil!");
    }
     
}