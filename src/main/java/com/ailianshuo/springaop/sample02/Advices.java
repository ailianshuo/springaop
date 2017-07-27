package com.ailianshuo.springaop.sample02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
/**
 *  通知类，横切逻辑
 * @author ailianshuo
 * 2017年7月25日 下午5:21:42
 * 
 * @Component表示该类的实例会被Spring IOC容器管理；
 * @Aspect表示声明一个切面；
 * @Before表示before为前置通知，通过参数execution声明一个切点
 * 
 */
@Component
@Aspect
public class Advices {
	@Before("execution(* com.ailianshuo.springaop.sample02.Math.*(..))")
	public void before(JoinPoint jp){
        System.out.println("----------before advice----------");
        System.out.println(jp.getSignature().getName());
    }
    
	@After("execution(* com.ailianshuo.springaop.sample02.Math.*(..))")
    public void after(JoinPoint jp){
        System.out.println("----------after advice----------");
    }
}
