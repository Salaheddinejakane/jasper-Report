package com.jasperReport.module.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponseWrapper {
    private int id;
    private String name;
    private double salary;
}
