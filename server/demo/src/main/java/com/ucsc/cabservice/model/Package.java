/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Jinadi
 */
@Entity
public class Package {

    private long package_id;
    private String package_name;
    private Set<Customer> customers = new HashSet<Customer>();

    /**
     * @return the package_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getPackage_id() {
        return package_id;
    }

    /**
     * @param package_id the package_id to set
     */
    public void setPackage_id(long package_id) {
        this.package_id = package_id;
    }

    /**
     * @return the package_name
     */
    public String getPackage_name() {
        return package_name;
    }

    /**
     * @param package_name the package_name to set
     */
    public void setPackage_name(String package_name) {
        this.package_name = package_name;
    }

    /**
     * @return the customers
     */
    @ManyToMany(cascade = CascadeType.ALL)

    public Set<Customer> getCustomers() {
        return customers;
    }

    /**
     * @param customers the customers to set
     */
    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
