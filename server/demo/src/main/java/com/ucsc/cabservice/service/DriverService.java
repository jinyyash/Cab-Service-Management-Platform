/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.service;

import com.ucsc.cabservice.model.Driver;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Jinadi
 */
public interface DriverService {

    public Driver addDriver(Driver driver);

    public Driver updateDriver(Driver driver);

    public String deleteDriver(Driver driver);

    public List<Driver> getAllDrivers();

    public Driver getDriver(Long id);

    public List<Driver> getDriverById(long id);

    public List<Driver> getDriverByName(String name);

    public List<Driver> getDriverByNic(String nic);
}
