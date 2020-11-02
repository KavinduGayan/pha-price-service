package com.easyittech.phapriceservice.domian;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pha_discount")
@Getter
@Setter
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "discount_id")
    private Long id;
    private String description;
    @Column(name = "discount_type")
    private String discountType;//percentage or amount
    @Column(name = "percentage_or_discount_amount")
    private int percentageOrDiscountAmount;
    private String status;
    @Column(name = "discount_level")
    private String discountLevel;//pharmacy level or drug level
    @Column(name = "pharmacy_id")
    private Long pharmacyId;
}
