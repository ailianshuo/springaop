package com.ailianshuo.springaop.sample03;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @annotation切点函数
 * 自定义一个可以注解在方法上的注解
 * 
 * target()：匹配指定目标类的所有方法
 * @target()：匹配当前目标对象类型的执行方法，其中目标对象持有指定的注解
 * @author ailianshuo
 * 2017年7月26日 上午10:45:17
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnno {

}
