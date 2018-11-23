/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.serviceImpl;

import com.ucsc.cabservice.model.Driver;
import com.ucsc.cabservice.repository.DriverRepository;
import com.ucsc.cabservice.service.DriverService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jinadi
 */
@Service
public class DiverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public Driver addDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public Driver updateDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    @Override
    public Driver getDriver(Long id) {
        return driverRepository.findOne(id);
    }

    @Override
    public String deleteDriver(Driver driver) {
        driverRepository.delete(driver);
        return "true";
    }

    @Override
    public List<Driver> getDriverById(long id) {
        List<Driver> d = driverRepository.getDriverById(id);
        System.out.println("driver list : " + d.size());
        return d;
    }

    @Override
    public List<Driver> getDriverByName(String name) {
        List<Driver> d = driverRepository.getDriverByName(name);
        System.out.println("driver list : " + d.size());
        return d;
    }

    @Override
    public List<Driver> getDriverByNic(String nic) {
        List<Driver> d = driverRepository.getDriverByNIC(nic);
        System.out.println("driver list : " + d.size());
        return d;
    }
}
