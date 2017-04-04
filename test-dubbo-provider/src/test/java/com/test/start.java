package com.test;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by guofei on 2017/4/4.
 */
public class start {
    //    static{
//        PropertyConfigurator.configure("F:\\Workspace\\Java\\DubboDemo\\test-dubbo-provider\\src\\main\\resources\\log4j.properties");
//    }
    public static void main(String[] args) throws IOException {

        //com.alibaba.dubbo.container.Main.main(args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:MATE-INF/spring/*.xml");

        context.start();

        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }
}