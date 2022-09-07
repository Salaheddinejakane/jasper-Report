package com.jasperReport.module.orderItem.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItemResponse {

    private Long id;
    private String product;
}
