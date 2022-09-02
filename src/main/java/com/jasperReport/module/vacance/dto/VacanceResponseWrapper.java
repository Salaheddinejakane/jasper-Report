package com.jasperReport.module.vacance.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VacanceResponseWrapper {

    private int id;
    private String vacance1;
    private String vacance2;
    private String vacance3;
}
