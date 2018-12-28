/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.controller;

import com.ucsc.cabservice.model.Package;
import com.ucsc.cabservice.service.PackageService;
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
public class PackageController {
      @Autowired
    PackageService packagesService;
  
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/packages", method = RequestMethod.POST,produces = {"application/json"})
    Package addPackage(@RequestBody Package packages) {
        return packagesService.addPackage(packages);
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/packages", method = RequestMethod.PUT, produces = {"application/json"})
    Package updatePackage(@RequestBody Package packages) {
        return packagesService.updatePackage(packages);
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/packages", method = RequestMethod.DELETE, produces = {"application/json"})
    String deletePackage(@RequestBody Package packages) {
        return packagesService.deletePackage(packages);
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/packages", method = RequestMethod.GET, produces = {"application/json"})
    List<Package> getAllPackages() throws Exception{
        return packagesService.getAllPackages();
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/packages/{id}", method = RequestMethod.GET, produces = {"application/json"})
    Package getPackage(@PathVariable("id") String id) {
       return packagesService.getPackage(Long.parseLong(id));
    }  
}
