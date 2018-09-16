/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.service;

import com.ucsc.cabservice.model.Driver;
import java.util.List;

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
}
