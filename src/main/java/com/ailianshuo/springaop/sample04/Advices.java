package com.ailianshuo.springaop.sample04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/**
 *  通知类，横切逻辑
 * @author ailianshuo
 * 2017年7月25日 下午5:21:42
 * 
 * 
 * 
 */
@Component
@Aspect
public class Advices {
	 
	/**
	 * 定义一个切点然后复用
	 */
    @Pointcut("execution(* com.ailianshuo.springaop.sample04.Math.*(..))")
    public void pointcutMath(){
    }
    
	@Before("pointcutMath()")
	public void before(JoinPoint jp){
        System.out.println("----------before advice----------");
        System.out.println(jp.getSignature().getName());
    }
    
	@After("pointcutMath()")
    public void after(JoinPoint jp){
        System.out.println("----------after advice----------");
    }
	 
	 
    
    //环绕通知
    @Around("execution(* com.ailianshuo.springaop.sample04.Math.d*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println(pjp.getSignature().getName());
        System.out.println("----------before around advice----------");
    //    Object result=pjp.proceed();
        System.out.println("----------after around advice----------");
        return 1;
    }
    
    //返回结果通知
    @AfterReturning(pointcut="execution(* com.ailianshuo.springaop.sample04.Math.d*(..))",returning="result")
    public void afterReturning(JoinPoint jp,Object result){
        System.out.println(jp.getSignature().getName());
        System.out.println("afterReturning："+result);
        System.out.println("----------after afterReturning advice----------");
    }
    
    //异常后通知
    @AfterThrowing(pointcut="execution(* com.ailianshuo.springaop.sample04.Math.d*(..))",throwing="exp")
    public void afterThrowing(JoinPoint jp,Exception exp){
        System.out.println(jp.getSignature().getName());
        System.out.println("Exception："+exp.getMessage());
        System.out.println("----------Exception advice----------");
    }
}
