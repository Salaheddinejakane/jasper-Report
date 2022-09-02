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
    /*

# =============================== # JPA / HIBERNATE # ===============================#
# =============================== # DATABASE # ===============================#
#
#spring.datasource.url=jdbc:postgresql://localhost:5432/person
#spring.datasource.username=user_demo
#spring.datasource.password=123
#spring.datasource.driver-class-name=org.postgresql.Driver
#
## =============================== # JPA / HIBERNATE # ===============================#
#
#spring.jpa.show-sql=true
#spring.jpa.hibernate.ddl-auto=create
#spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
#
#spring.jpa.properties.hibernate.globally_quoted_identifiers=true



     */
}
