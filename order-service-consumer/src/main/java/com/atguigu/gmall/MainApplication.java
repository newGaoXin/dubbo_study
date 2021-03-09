package com.atguigu.gmall;

import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.impl.OrderServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        for (int i = 0; i < 6; i++) {
            OrderService orderService = context.getBean(OrderService.class); // 获取远程服务代理
            orderService.initOrder("1");
        }

        System.in.read();
    }
}
