package com.ailianshuo.springaop.sample04;

import org.springframework.stereotype.Service;

/**
 * 创建要被代理的Math类
 * 为了实现IOC扫描在Math类上注解了@Service并命名bean为math。相当于sample01示例中在xml配置文件中增加了一个bean，<!-- 被代理对象 --><bean id="math" class="com.ailianshuo.springaop.sample01.Math"></bean>
 * @author ailianshuo
 * 2017年7月25日 下午5:20:32
 */
@Service("math")
public class Math {
	//加
    public int add(int n1,int n2){
        int result=n1+n2;
        System.out.println(n1+"+"+n2+"="+result);
        return result;
    }
    
    //减
    public int sub(int n1,int n2){
        int result=n1-n2;
        System.out.println(n1+"-"+n2+"="+result);
        return result;
    }
    
    //乘
    public int mut(int n1,int n2){
        int result1=n1*n2;
        System.out.println(n1+"X"+n2+"="+result1);
        return result1;
    }
    //除
    public int div(int n1,int n2){
        int result=n1/n2;
        System.out.println(n1+"/"+n2+"="+result);
        return result;
    }
    //2次平方
    public int pow(int n1){
        int result=n1*n1;
        System.out.println(n1+"*"+n1+"="+result);
        return result;
    }
    
    
}
