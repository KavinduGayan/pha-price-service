package com.easyittech.phapriceservice.repository;

import com.easyittech.phapriceservice.domian.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface PriceRepository extends JpaRepository<Price,Long> {
}
