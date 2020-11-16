package com.easyittech.phapriceservice.controller;

import com.easyittech.phapriceservice.domian.Price;
import com.easyittech.phapriceservice.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/prices")
@CrossOrigin(origins = "http://localhost:4200")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @PostMapping("/add")
    public ResponseEntity<Price> saveDrugDealer(@RequestBody Price price){
        return ResponseEntity.ok().body(priceService.save(price));
    }
    @GetMapping("/")
    public ResponseEntity<List<Price>> getAllPriceList(){
        return ResponseEntity.ok().body(priceService.getAllPriceList());
    }
    @GetMapping("/{drug_id}")
    public ResponseEntity<Price> getPriceId(@PathVariable("drug_id") Long drugId) {
        return ResponseEntity.ok().body(priceService.getPriceByDrugId(drugId));
    }
}
