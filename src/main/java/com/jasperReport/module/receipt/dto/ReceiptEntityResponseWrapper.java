package com.jasperReport.module.receipt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReceiptEntityResponseWrapper {

    private Long id;

    private String num;

    private String name;

}
