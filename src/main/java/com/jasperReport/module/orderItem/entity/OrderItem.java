package com.jasperReport.module.orderItem.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jasperReport.module.order.entity.OrderEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class OrderItem {

      /* identifier of order item
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    /* product of order
     */
//    @ManyToOne
//    private Product productEntity;

    private String product;

    /* Order of order item

     */
    @JsonIgnore
    @ManyToOne
    private OrderEntity order;

    /* unit price excluding tax of order item
     */
    private Double unitPriceHT;

    /* unit price including tax of order item
     */
    private Double unitPriceTTC;

    /* Enum indicates order item priority
     */
//    private OrderPriority priority;

    /* ordered quantity
     */
//    private Integer orderedQuantity;
//
//    /* remaining quantity
//     */
//    private Integer alreadyReceived;
//
//    private Boolean active;

//    public OrderItem() {
//        alreadyReceived = 0;
//    }
}
