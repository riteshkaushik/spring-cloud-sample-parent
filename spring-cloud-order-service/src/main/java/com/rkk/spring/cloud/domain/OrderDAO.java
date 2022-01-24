package com.rkk.spring.cloud.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDAO {

    Long orderId;
    String orderName;
    String orderDescription;
}
