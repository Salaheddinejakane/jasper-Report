package com.jasperReport.module.orderPriority.entity;

import com.jasperReport.module.order.entity.OrderEntity;
import com.jasperReport.module.orderItem.entity.OrderItem;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity

@AllArgsConstructor
@NoArgsConstructor
public class OrderPriority {
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
    private List<OrderEntity> orderEntityList;



}
