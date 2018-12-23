/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jinadi
 */
@Entity
@Table(name="vehicle")

public class Vehicle implements Serializable {

    private long vehicle_id;
    private String vehicle_num;
    private String name;
    private String type;
    private int numOfseats;
    private String description;
   /* @Access(AccessType.FIELD)
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "vehicle_id")*/
  
 /*   @ManyToMany(targetEntity = Driver.class, cascade = {CascadeType.ALL},fetch=FetchType.EAGER)
    @JoinTable(name = "driver",
            joinColumns = {
                @JoinColumn(name = "vehicle_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "id")})*/
  

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
     * @return the vehicle_num
     */
    public String getVehicle_num() {
        return vehicle_num;
    }

    /**
     * @param vehicle_num the vehicle_num to set
     */
    public void setVehicle_num(String vehicle_num) {
        this.vehicle_num = vehicle_num;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the numOfseats
     */
    public int getNumOfseats() {
        return numOfseats;
    }

    /**
     * @param numOfseats the numOfseats to set
     */
    public void setNumOfseats(int numOfseats) {
        this.numOfseats = numOfseats;
    }

    

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the rides
     */
    
    /**
     * @return the Package
     */
    /*@OneToMany(cascade = CascadeType.ALL)
    public Set<Package> getPackage() {
        return Package;
    }

    /**
     * @param Package the Package to set
     */
 /* public void setPackage(Set<Package> Package) {
        this.Package = Package;
    }*/
}
