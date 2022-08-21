package com.jasperReport.module.employee.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeResponse {

    private int id;
    private String name;
    private double salary;
}
