package com.dubbo.demo.consumer;

import com.dubbo.demo.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jerry Lee
 */
public class ConsumerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-context-consumer.xml");
        classPathXmlApplicationContext.start();

        HelloService helloService = (HelloService) classPathXmlApplicationContext.getBean("helloService");
        long start = System.currentTimeMillis();
        System.out.println("start time:" + start);
        for(int i=0;i<100000;i++){
        	System.out.println("start to =====================================:" + i);
        	String world = helloService.hello("World");
        	
            System.out.println(world);
            System.out.println("end to =====================================" + i);
        }
        System.out.println("use time:" +( System.currentTimeMillis() - start));
    }
}
