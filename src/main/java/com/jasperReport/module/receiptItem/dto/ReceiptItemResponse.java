package com.jasperReport.module.receiptItem.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReceiptItemResponse {

    private Long id;
    private String product;
}
