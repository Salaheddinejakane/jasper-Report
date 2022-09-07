package com.jasperReport.module.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntityResponseWrapper {

    private Long id;

    private String num;

    private String name;

}
