package com.learn2code.veihcle.api.search.service.impl;

import com.learn2code.veihcle.api.search.dao.ManufactureDao;
import com.learn2code.veihcle.api.search.entity.Manufacturer;
import com.learn2code.veihcle.api.search.exception.ManufacturerNotFoundException;
import com.learn2code.veihcle.api.search.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ManufacturerImpl implements ManufacturerService {

    private final ManufactureDao manufactureDao;

    public ManufacturerImpl(ManufactureDao manufactureDao) {
        this.manufactureDao = manufactureDao;
    }

    @Override
    public Manufacturer saveManuFacturer(Manufacturer manufacturer) {
        return manufactureDao.save(manufacturer);
    }

    @Override
    public List<Manufacturer> findAllManufacturer() {
        return manufactureDao.findAll();
    }

    @Override
    public Optional<Manufacturer> findManufacturerById(Integer id) {
        return manufactureDao.findById(id);
    }


}
