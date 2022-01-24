package com.rkk.spring.cloud.controller;

import com.rkk.spring.cloud.domain.OrderDAO;
import com.rkk.spring.cloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/getOrder")
    public OrderDAO getOrder(HttpServletRequest httpServletRequest) {
        return orderService.getOrder(httpServletRequest,123l);
    }

    @GetMapping(value = "/getOrderCustomer")
    public String getOrderCustomer() {
        return orderService.getOrderCustomer();
    }

}
