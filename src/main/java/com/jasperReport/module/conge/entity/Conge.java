package com.jasperReport.module.conge.entity;


import com.jasperReport.module.employee.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
//@Table(name = "Conge_TBL")
public class Conge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date dateEntre;
    private Date dateSortie;

    @ManyToOne
    @JoinColumn(name="employee",nullable = false,referencedColumnName = "id")
    private Employee employee;

   /*
     @ManyToOne
     @JoinColumn(referencedColumnName = "id")
     private Employee employee;
    */

}
