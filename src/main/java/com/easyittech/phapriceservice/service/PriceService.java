package com.easyittech.phapriceservice.service;

import com.easyittech.phapriceservice.domian.Price;

import java.util.List;

public interface PriceService {
    List<Price> getAllPriceList();

    Price save(Price price);

    Price getPriceByDrugId(Long drugId);
}
