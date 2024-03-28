package com.learn2code.veihcle.api.search.service;

import com.learn2code.veihcle.api.search.entity.Manufacturer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ManufacturerService {

        Manufacturer  saveManuFacturer(Manufacturer manufacturer) ;

        List<Manufacturer> findAllManufacturer();

        Optional<Manufacturer> findManufacturerById(Integer id);

}
