/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.controller;

import com.ucsc.cabservice.emailUtil.EmailSender;
import com.ucsc.cabservice.model.Driver;
import com.ucsc.cabservice.service.DriverService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
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
     
//     @Autowired
     private EmailSender emailSender =new EmailSender();
  
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
    
    ////pass values through URL
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/driverByNIC/{nic}", method = RequestMethod.GET, produces = {"application/json"})
    List<Driver> getAllDriversByNIC(@PathVariable("nic") String nic) throws Exception{
        return driverService.getDriverByNic(nic);
    }
    //passing value through URL in id
     @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/driverByID/{id}", method = RequestMethod.GET, produces = {"application/json"})
    List<Driver> getAllDriversByID(@PathVariable("id") long id) throws Exception{
        return driverService.getDriverById(id);
    }
    //passing value through URL in id
     @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/driverByName/{name}", method = RequestMethod.GET, produces = {"application/json"})
    List<Driver> getAllDriversByName(@PathVariable("name") String id) throws Exception{
        return driverService.getDriverByName(id);
    }
    
    ////pass through req body for id
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/driverById", method = RequestMethod.POST, produces = {"application/json"})
    List<Driver> getAllDriverById(HttpServletRequest httpServletRequest) throws Exception{
        System.out.println("getAllDriversById2 called");
        long nic=Long.parseLong(httpServletRequest.getParameter("id"));
        System.out.println("id : "+nic);
        return driverService.getDriverById(nic);
    }
    //pass value  req body driver search in name
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/driverByName", method = RequestMethod.POST, produces = {"application/json"})
    List<Driver> getAllDriversByName(HttpServletRequest httpServletRequest) throws Exception{
        System.out.println("getAllDriversById2 called");
        String nic=httpServletRequest.getParameter("name");
        System.out.println("nicccccccccccc : "+nic);
        return driverService.getDriverByName(nic);
    }
    ////sending mail
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/sendEmail", method = RequestMethod.POST, produces = {"application/json"})
    String sendEmail(HttpServletRequest httpServletRequest) throws Exception{
        System.out.println("send Email method called");
        String email=httpServletRequest.getParameter("email");
        String password=httpServletRequest.getParameter("password");
        String toEmail=httpServletRequest.getParameter("toEmail");
        String subject=httpServletRequest.getParameter("subject");
        String body=httpServletRequest.getParameter("body");
//        System.out.println("nicccccccccccc : "+nic);
        
        return emailSender.sendMail(email, password, toEmail, subject, body);
//        return "";
    }
}