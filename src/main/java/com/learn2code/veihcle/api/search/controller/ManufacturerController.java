package com.learn2code.veihcle.api.search.controller;

import com.learn2code.veihcle.api.search.entity.Manufacturer;
import com.learn2code.veihcle.api.search.exception.ManufacturerNotFoundException;
import com.learn2code.veihcle.api.search.service.ManufacturerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/manufacturers")
@Slf4j
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
    @GetMapping("/{id}")
    public ResponseEntity<Manufacturer> getManufacturerById(@PathVariable int id) throws ManufacturerNotFoundException {
        Optional<Manufacturer> manufacturerById = manufacturerService.findManufacturerById(id);
        if (!manufacturerById.isPresent() ){
            throw new ManufacturerNotFoundException("the manufacturer not found with this id " + id);
        }

        return ResponseEntity.ok(manufacturerById.get());


    }















}
