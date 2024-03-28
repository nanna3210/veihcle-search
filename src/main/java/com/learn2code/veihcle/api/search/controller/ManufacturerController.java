package com.learn2code.veihcle.api.search.controller;

import com.learn2code.veihcle.api.search.entity.Manufacturer;
import com.learn2code.veihcle.api.search.service.ManufacturerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/manufacturers")
public class ManufacturerController {
    private ManufacturerService manufacturerService;
//dependency injection  constructor
    public ManufacturerController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

//    creating record of manufacturer
        @PostMapping
        public ResponseEntity<Manufacturer> createManufacturer(@RequestBody Manufacturer manufacturer){
            Manufacturer manufacturerrec = manufacturerService.saveManuFacturer(manufacturer);


            return new ResponseEntity<>(manufacturerrec, HttpStatus.CREATED);
        }

//getting all records of manufacturer

    @GetMapping
    public ResponseEntity<List<Manufacturer>> getAllmanufacturer(){
        List<Manufacturer> allManufacturer = manufacturerService.findAllManufacturer();
        return new ResponseEntity<>(allManufacturer, HttpStatus.OK);
    }



}
