package com.jasperReport.module.employee.entity;

import com.jasperReport.module.entreprise.entity.Entreprise;
import com.jasperReport.module.vacance.entity.Vacance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;


    @ManyToOne
    private Entreprise entreprise;
    /*

        CREATE ONE TO MANY RELATION TO X ENTITY
     */
    @OneToMany(mappedBy="employee")
    private List<Vacance> vacanceList;
}
