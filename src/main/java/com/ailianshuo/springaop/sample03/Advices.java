package com.ailianshuo.springaop.sample03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
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
 * @Component表示该类的实例会被Spring IOC容器管理；
 * @Aspect表示声明一个切面；
 * @Before表示before为前置通知，通过参数execution声明一个切点
 * 
 * execution(<修饰符模式>?<返回类型模式><方法名模式>(<参数模式>)<异常模式>?)
 * 
 * @AspectJ使用AspectJ专门的切点表达式描述切面，Spring所支持的AspectJ表达式可分为四类:
 * 方法切点函数：通过描述目标类方法信息定义连接点。
 * 方法参数切点函数：通过描述目标类方法入参信息定义连接点。
 * 目标类切点函数：通过描述目标类类型信息定义连接点。
 * 代理类切点函数：通过描述代理类信息定义连接点。

 * 常见的AspectJ表达式函数：
 * execution()：满足匹配模式字符串的所有目标类方法的连接点
 * @annotation()：任何标注了指定注解的目标方法链接点
 * args()：目标类方法运行时参数的类型指定连接点
 * @args()：目标类方法参数中是否有指定特定注解的连接点
 * within()：匹配指定的包的所有连接点
 * target()：匹配指定目标类的所有方法
 * @within()：匹配目标对象拥有指定注解的类的所有方法
 * @target()：匹配当前目标对象类型的执行方法，其中目标对象持有指定的注解
 * this()：匹配当前AOP代理对象类型的所有执行方法
 * 
 * 
 * 优先执行顺序：
 * annotation --> args --> execution --> this --> within
 * 
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
    @Pointcut("execution(* com.ailianshuo.springaop.sample03.Math.*(..))")
    public void pointcutMath(){
    }
	@Before("pointcutMath()")
	public void before(JoinPoint jp){
		//System.out.println(jp.getSignature().getName());
	    System.out.println("----------before advice----------");
    }
    
	/**
	 * execution()：满足匹配模式字符串的所有目标类方法的连接点
	 * com.ailianshuo.springaop.sample03.Math包下所有类的所有方法被切入
	 * @param jp
	
	@After("pointcutMath()")
    public void after_execution(JoinPoint jp){
        System.out.println("----------after execution advice----------");
    }
	
	*/ 
	

	/**
	 * within()：匹配指定的包的所有连接点
	 * com.ailianshuo.springaop.sample03包下所有类的所有方法被切入
	 * @param jp
	  
	@After("within(com.ailianshuo.springaop.sample03.*)")
    public void after_within(JoinPoint jp){
        System.out.println("----------after within advice----------");
    }
	*/
	
	/**
	 * 
	 * this切点函数
	 * this()：匹配当前AOP代理对象类型的所有执行方法
	 * 
	 * @param jp
	 
	@After("this(com.ailianshuo.springaop.sample03.Math)")
    public void after_this_Math(JoinPoint jp){
        System.out.println("----------after this Math advice----------");
    }
	*/
	/**
	 * 
	 * this切点函数
	 * this()：匹配当前AOP代理对象类型的所有执行方法
	 * 
	 * @param jp
	
	@After("this(com.ailianshuo.springaop.sample03.StrUtil)")
    public void after_this_StrUtil(JoinPoint jp){
        System.out.println("----------after this StrUtil advice----------");
    }
	 */
	
	/**
	 * 
	 * args切点函数
	 * 要求方法有两个int类型的参考才会被织入横切逻辑
	 * @param jp
	 
	@After("args(int,int)")
    public void after_args(JoinPoint jp){
        System.out.println("----------after args advice----------");
    }
	*/
	
	/**
	 * 
	 * @annotation切点函数
	 * @annotation()：任何标注了指定注解的目标方法链接点
	 * 要求方法必须被注解com.ailianshuo.springaop.sample03.MyAnno才会被织入横切逻辑
	 * @param jp
	*/
	@After("@annotation(com.ailianshuo.springaop.sample03.MyAnno)")
    public void after_annotation(JoinPoint jp){
        System.out.println("----------after annotation advice----------");
    }
	 
}
