package com.jasperReport.module.conge.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CongeResponseWrapper {

    private int id;
    private Date dateEntre;
    private Date dateSortie;
}
