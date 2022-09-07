package com.jasperReport.module.order.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderEntityResponse {
    private Long id;

    private String num;

    private String name;


}
