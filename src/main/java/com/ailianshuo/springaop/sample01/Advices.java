package com.ailianshuo.springaop.sample01;

import org.aspectj.lang.JoinPoint;
/**
 *  通知类，横切逻辑
 * @author ailianshuo
 * 2017年7月25日 下午5:21:42
 */
public class Advices {
	public void before(JoinPoint jp){
        System.out.println("----------before advice----------");
        System.out.println(jp.getSignature().getName());
    }
    
    public void after(JoinPoint jp){
        System.out.println("----------after advice----------");
    }
}
