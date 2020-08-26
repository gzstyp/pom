package com.fwtai.service.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务提供者
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2018-07-11 22:32
 * @QQ号码 444141300
 * @官网 http://www.fwtai.com
*/
public class ProviderTest{

    public static void main(String[] args){
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.out.println(" Provider 向 ZooKeeper 注册中心注册了服务（端口：20880）");
        try{
            System.in.read();
        }catch(IOException e){
            e.printStackTrace();
        }
        context.close();
    }
}