package com.jasperReport.module.product.entity;

import com.jasperReport.module.orderItem.entity.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity

@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(unique = true)
    /**
     * name is unique only when produdct is not of type 'medicine'
     */
    private String name;

    public String getName() {
        return name;
    }

    @OneToMany
    private List<OrderItem> orderItemList;



}
