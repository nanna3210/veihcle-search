package com.learn2code.veihcle.api.search.service;

import com.learn2code.veihcle.api.search.entity.Manufacturer;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ManufacturerService {

        Manufacturer  saveManuFacturer(Manufacturer manufacturer) ;

        List<Manufacturer> findAllManufacturer();

        Manufacturer findManufacturerById(Integer id);

}
