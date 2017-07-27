package com.ailianshuo.springaop.sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用注解配置Spring AOP
 * @author ailianshuo
 * 2017年7月25日 下午11:42:57
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aopsample02.xml");
        Math math = ctx.getBean("math", Math.class);
        int n1 = 10, n2 = 5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }

}
