package com.fwtai.test;

import com.fwtai.service.ProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 服务消费者
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2018-07-11 22:20
 * @QQ号码 444141300
 * @官网 http://www.fwtai.com
*/
public class ConsumerTest{

    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        final ProviderService demoProviderService=(ProviderService) context.getBean("ProviderService");
        final String result=demoProviderService.updateString("Consummer");
        System.out.println(""+result);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        context.close();
    }
}