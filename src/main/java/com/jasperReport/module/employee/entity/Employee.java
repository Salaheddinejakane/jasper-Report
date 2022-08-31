package com.jasperReport.module.employee.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jasperReport.module.conge.entity.Conge;
import com.jasperReport.module.skill.entity.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "employee_id")
    private int id;
//    @Column(name = "employee_name")
    private String name;

    @ManyToOne
    private Conge conges;

//    @ManyToOne
//    private Conge conges;
    /*

        CREATE ONE TO MANY RELATION TO X ENTITY
     */
//    @OneToMany(mappedBy="employee")
//    private List<Skill> skills;

    @ManyToOne
    private Skill skills;





}
