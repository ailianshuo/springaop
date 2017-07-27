package com.ailianshuo.springaop.sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AspectJ切点函数
 * 切点函数可以定位到准确的横切逻辑位置
 * @author ailianshuo
 * 2017年7月25日 下午11:42:57
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aopsample04.xml");
        Math math = ctx.getBean("math", Math.class);
        int n1 = 10, n2 = 5;
        System.out.println("****************************** Add ******************************");
        math.add(n1, n2);
        System.out.println("");
        System.out.println("****************************** sub ******************************");
        math.sub(n1, n2);
        
        System.out.println("");
        System.out.println("****************************** mut ******************************");
        math.mut(n1, n2);

        //n2 = 0;
        System.out.println("");
        System.out.println("****************************** div ******************************");
        math.div(n1, n2);
        
        System.out.println("");
        System.out.println("****************************** pow ******************************");
        math.pow(n1 );
        
        
        
        
        StrUtil strUtil=ctx.getBean("strUtil",StrUtil.class);
        
        System.out.println("");
        System.out.println("****************************** strUtil ******************************");
        strUtil.show();
        
        
    }

}
