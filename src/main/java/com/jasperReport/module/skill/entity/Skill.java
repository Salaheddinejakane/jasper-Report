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
//@Table(name = "Conge_TBL")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String skillname;
    @JsonIgnore

    @ManyToOne
    private Employee employee;


}
