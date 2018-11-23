/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabServiceManagementSystem.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Jinadi
 */
@Entity
public class Vehicle {
    private long vehicle_id;
    private Set<Package> Package=new HashSet<Package>();
    /**
     * @return the vehicle_id
     */
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getVehicle_id() {
        return vehicle_id;
    }

    /**
     * @param vehicle_id the vehicle_id to set
     */
    public void setVehicle_id(long vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    /**
     * @return the Package
     */
    @OneToMany(cascade = CascadeType.ALL)
    public Set<Package> getPackage() {
        return Package;
    }

    /**
     * @param Package the Package to set
     */
    public void setPackage(Set<Package> Package) {
        this.Package = Package;
    }
}
