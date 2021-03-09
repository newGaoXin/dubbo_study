package com.atguigu.bootorderserviceconsumer.controller;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/init")
    public List<UserAddress> initOrder(@RequestParam(name = "uId") String userId){
        List<UserAddress> list = orderService.initOrder(userId);
        return list;
    }
}
