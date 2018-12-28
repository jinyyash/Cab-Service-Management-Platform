/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.service;

import com.ucsc.cabservice.model.Vehicle;
import java.util.List;

/**
 *
 * @author Jinadi
 */
public interface VehicleService {

    public Vehicle addVehicle(Vehicle vehicle);

    public Vehicle updateVehicle(Vehicle vehicle);

    public String deleteVehicle(Vehicle vehicle);

    public List<Vehicle> getAllVehicles();

    public Vehicle getVehicle(Long id);
}
