package com.jasperReport.module.receiptItem.entity;


import com.jasperReport.module.receipt.entity.Receipt;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ReceiptItem {

    /**
     * identifier of receipt item
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    /**
     * product of receipt item
     */

    private String productEntity;

    @ManyToOne
    private Receipt receipt;




    /**
     * unit quantity of receipt item
     */
    private Double unitQuantity;

    /**


    /**
     * unit buy price excluding tax of receipt item
     */
    private Double unitBuyPriceHT;



    /**
     * unit buy price including tax of receipt item
     */
    private Double unitBuyPriceTTC;

    /**
     * box buy price tax of receipt item
     */
    private Double productTVA;







}
