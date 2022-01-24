package com.rkk.spring.cloud.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerServiceFeign {

    @RequestMapping(value = "/customer/getCustomer", method = RequestMethod.GET)
    String testCustomer();

}
