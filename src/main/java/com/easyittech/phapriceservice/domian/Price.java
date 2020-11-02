package com.easyittech.phapriceservice.domian;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pha_price")
@Getter@Setter
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "price_id")
    private Long id;
    @Column(name = "unit_price")
    private double unitPrice;
    @Column(name = "batch_price")
    private double batchPrice;
    @Column(name = "batch_count")
    private Long batchCount;
    private String status;
    @Column(name = "drug_id")
    private Long drugId;
    @Column(name = "inserted_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
}
