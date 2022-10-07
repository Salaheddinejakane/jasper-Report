package com.jasperReport.module.receiptItem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReceiptResponseWrapper {

    private Long id;
    private String product;
}
