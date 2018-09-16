/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.controller;

import com.ucsc.cabservice.model.Driver;
import com.ucsc.cabservice.service.DriverService;
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
public class DriverController {
     @Autowired
    DriverService driverService;
  
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/driver", method = RequestMethod.POST,produces = {"application/json"})
    Driver addDriver(@RequestBody Driver driver) {
        return driverService.addDriver(driver);
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/driver", method = RequestMethod.PUT, produces = {"application/json"})
    Driver updateDriver(@RequestBody Driver driver) {
        return driverService.updateDriver(driver);
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/driver", method = RequestMethod.DELETE, produces = {"application/json"})
    String deleteDriver(@RequestBody Driver driver) {
        return driverService.deleteDriver(driver);
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/driver", method = RequestMethod.GET, produces = {"application/json"})
    List<Driver> getAllDrivers() throws Exception{
        return driverService.getAllDrivers();
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/driver/{id}", method = RequestMethod.GET, produces = {"application/json"})
    Driver getDriver(@PathVariable("id") String id) {
       return driverService.getDriver(Long.parseLong(id));
    }  
}
