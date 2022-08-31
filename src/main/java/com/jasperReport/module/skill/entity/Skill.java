package com.jasperReport.module.skill.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jasperReport.module.employee.entity.Employee;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
//@Table(name = "Skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "skill_id")
    private int id;
//    @Column(name = "skill_name")
    private String skillname;
    @JsonIgnore

    @OneToMany
    private List<Employee> employees;



}
