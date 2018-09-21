 package com.ucsc.cabservice.controller;


import com.ucsc.cabservice.model.Customer;
import com.ucsc.cabservice.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry Conde, webmaster@javapointers.com
 * @since 8/9/2016
 */
@RestController
@RequestMapping("/api")

public class HomeController {
    
    @Autowired
    CustomerService customerService;

    @RequestMapping("/")
    public String viewHome() {
        return "index";
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/customer", method = RequestMethod.POST,produces = {"application/json"})
    Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/customer", method = RequestMethod.PUT, produces = {"application/json"})
    Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/customer", method = RequestMethod.DELETE, produces = {"application/json"})
    String deleteCustomer(@RequestBody Customer customer) {
        return customerService.deleteCustomer(customer);
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/customer", method = RequestMethod.GET, produces = {"application/json"})
    List<Customer> getAllCustomers() throws Exception{
        return customerService.getAllCustomers();
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET, produces = {"application/json"})
    Customer getCustomer(@PathVariable("id") String id) {
       return customerService.getCustomer(Long.parseLong(id));
    }
}
