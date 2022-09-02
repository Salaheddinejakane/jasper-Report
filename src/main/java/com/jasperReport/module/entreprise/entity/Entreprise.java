package com.jasperReport.module.entreprise.entity;



import com.jasperReport.module.employee.entity.Employee;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor


@Entity
//@Table(name = "Conge_TBL")
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String namedeentreprise;

    @OneToMany
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getNamedeentreprise() {
        return namedeentreprise;
    }

    public void setNamedeentreprise(String namedeentreprise) {
        this.namedeentreprise = namedeentreprise;
    }
}
