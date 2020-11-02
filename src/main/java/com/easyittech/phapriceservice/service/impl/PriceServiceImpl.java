package com.easyittech.phapriceservice.service.impl;

import com.easyittech.phapriceservice.domian.Price;
import com.easyittech.phapriceservice.repository.PriceRepository;
import com.easyittech.phapriceservice.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    private PriceRepository priceRepository;
    @Override
    public List<Price> getAllPriceList() {
        return priceRepository.findAll();
    }

    @Override
    public Price save(Price price) {
        price.setTimeStamp(new Date());
        return priceRepository.save(price);
    }
}
