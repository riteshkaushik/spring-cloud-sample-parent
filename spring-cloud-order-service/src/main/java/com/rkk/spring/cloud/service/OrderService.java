package com.rkk.spring.cloud.service;

import com.rkk.spring.cloud.domain.OrderDAO;
import com.rkk.spring.cloud.feignclient.CustomerServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class OrderService {

    @Autowired
    private CustomerServiceFeign customerServiceFeign;

    public OrderDAO getOrder(HttpServletRequest httpServletRequest, Long orderId) {
        OrderDAO orderDAO = new OrderDAO(123l, "OrderItem1", httpServletRequest.getRequestURL().toString());
        return orderDAO;
    }

    public String getOrderCustomer() {
        return customerServiceFeign.testCustomer();
    }
}
