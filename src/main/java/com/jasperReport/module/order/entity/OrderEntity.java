package com.jasperReport.module.order.entity;

import com.jasperReport.module.orderItem.entity.OrderItem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* num of order
     */
    @Column(unique = true)
   private String num;

    private String frsname;
    private String frsadress;
    private String frsfax;
    private String frsmobile;
    private String cltname;
    private String frsmail;
    private String cltadress;
    private String cltfax;
    private String cltmobile;
    private String cltmail;



    /* remark of order

    /**
     * Enum indicates order priority
     */

    private String priority;
    private String validatedBy;
    private String remark;

    /*
    Add validepar
     */

    /* List of products/items in order
     */
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private Set<OrderItem> items;


    /* Add tva
     */
    private Integer TVA;

    /* total price excluding tax of order
     */
    private Double totalPriceHT;

    /* total price including tax of order
     */
    private Double totalPriceTTC;

    /* Boolean indicates if order is active or not
     */
//    private Boolean active;


}
