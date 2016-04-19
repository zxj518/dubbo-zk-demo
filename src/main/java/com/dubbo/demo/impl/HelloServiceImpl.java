package com.dubbo.demo.impl;

import com.dubbo.demo.HelloService;

/**
 * @author Jerry Lee
 */
public class HelloServiceImpl implements HelloService {
	private static long helloCount = 0;
    @Override
    public String hello(String name) {
    	helloCount++;
    	if(helloCount%10==0){
    		System.out.println("received " + name + helloCount);
    	}
        return "Hello, " + name + "!";
        
    }
}
