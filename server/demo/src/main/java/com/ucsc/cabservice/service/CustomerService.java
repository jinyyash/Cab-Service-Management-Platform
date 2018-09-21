/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.service;

import com.ucsc.cabservice.model.Customer;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pasan Mudalige
 */

public interface CustomerService {
    public Customer addCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public String deleteCustomer(Customer customer);
    public List<Customer> getAllCustomers();
    public Customer getCustomer(Long id);
}
