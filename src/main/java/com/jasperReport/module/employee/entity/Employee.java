package com.jasperReport.module.employee.entity;

;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jasperReport.module.conge.entity.Conge;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
//@Table(name = "EMPLOYEE_TBL")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double salary;
/*
    @OneToMany(mappedBy = "employee")
   // @JsonIgnore
    private Set<Conge> conge;


 */

@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
//private Set<Conge> conge = new HashSet<>();
@JsonIgnoreProperties({"hibernateLazyInitializer", "employee"})
    private List<Conge> conges;




}
