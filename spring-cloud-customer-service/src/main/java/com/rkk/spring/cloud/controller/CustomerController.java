package com.rkk.spring.cloud.controller;

import com.rkk.spring.cloud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Value("${user.role}")
    private String role;

    @Value("${user.password}")
    private String sample_password;

    @RequestMapping(value = "/getCustomer", method = RequestMethod.GET)
    public String testCustomer(HttpServletRequest httpServletRequest) {

        return httpServletRequest.getRequestURL().toString() + " : role : " + role + " : password : " + sample_password;
        //customerService.testCustomer();
    }

}
