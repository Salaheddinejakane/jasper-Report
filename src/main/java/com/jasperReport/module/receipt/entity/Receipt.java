package com.jasperReport.module.receipt.entity;

import com.jasperReport.module.receiptItem.entity.ReceiptItem;
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
public class Receipt {






    /**
     * identifier of receipt
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * num of receipt
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


    private String validatedBy;

    private String conforme;




    /**
     * remark of receipt
     */
    private String remark;


    /**
     * receipt items related to a receipt
     */
    @OneToMany(mappedBy = "receipt", cascade = CascadeType.ALL)
    private Set<ReceiptItem> items;

    /**
     * total price excluding tax of receipt
     */
    private Double totalPriceHT;

    /**
     * total price including tax of receipt
     */
    private Double totalPriceTTC;




}
