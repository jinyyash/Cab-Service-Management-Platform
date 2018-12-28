/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.controller;

import com.ucsc.cabservice.model.Vehicle;
import com.ucsc.cabservice.service.VehicleService;
import com.ucsc.cabservice.service.VehicleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jinadi
 */
@RestController
@RequestMapping("/api")
public class VehicleController {
      @Autowired
      VehicleService vehicleService;
  
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/vehicle", method = RequestMethod.POST,produces = {"application/json"})
    Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.addVehicle(vehicle);
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/vehicle", method = RequestMethod.PUT, produces = {"application/json"})
    Vehicle updateVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.updateVehicle(vehicle);
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/vehicle", method = RequestMethod.DELETE, produces = {"application/json"})
    String deleteVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.deleteVehicle(vehicle);
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/vehicle", method = RequestMethod.GET, produces = {"application/json"})
    List<Vehicle> getAllVehicles() throws Exception{
        return vehicleService.getAllVehicles();
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/vehicle/{id}", method = RequestMethod.GET, produces = {"application/json"})
    Vehicle getVehicle(@PathVariable("id") String id) {
       return vehicleService.getVehicle(Long.parseLong(id));
    }  
}
