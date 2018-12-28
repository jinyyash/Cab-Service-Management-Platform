/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.serviceImpl;

import com.ucsc.cabservice.model.Vehicle;
import com.ucsc.cabservice.repository.VehicleRepository;
import com.ucsc.cabservice.service.VehicleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jinadi
 */
@Service
public class VehicleServiceImpl implements VehicleService{
    
    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle updateVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicle(Long id) {
        return vehicleRepository.findOne(id);
    }

    @Override
    public String deleteVehicle(Vehicle vehicle) {
        vehicleRepository.delete(vehicle);
        return "true";
    }
    
}
