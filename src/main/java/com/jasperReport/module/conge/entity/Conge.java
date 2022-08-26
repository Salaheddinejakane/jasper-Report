package com.jasperReport.module.conge.entity;



import com.jasperReport.module.employee.entity.Employee;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor


@Entity
//@Table(name = "Conge_TBL")
public class Conge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String congename;

    @OneToMany
    private List<Employee> employees;

    public String getCongename() {
        return congename;
    }

    public void setCongename(String congename) {
        this.congename = congename;
    }
}
