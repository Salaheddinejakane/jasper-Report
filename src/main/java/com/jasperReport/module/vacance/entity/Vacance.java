package com.jasperReport.module.vacance.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jasperReport.module.employee.entity.Employee;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class Vacance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String vacance1;
    private String vacance2;
    private String vacance3;
    @JsonIgnore

    @ManyToOne
    private Employee employee;

    public String getVacance1() {
        return vacance1;
    }

    public void setVacance1(String vacance1) {
        this.vacance1 = vacance1;
    }

    public String getVacance2() {
        return vacance2;
    }

    public void setVacance2(String vacance2) {
        this.vacance2 = vacance2;
    }

    public String getVacance3() {
        return vacance3;
    }

    public void setVacance3(String vacance3) {
        this.vacance3 = vacance3;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
