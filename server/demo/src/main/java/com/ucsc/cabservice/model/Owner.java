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
public class Owner {

    private long owner_id;
    private Set<Vehicle> Vehicle = new HashSet<Vehicle>();

    /**
     * @return the owner_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getOwner_id() {
        return owner_id;
    }

    /**
     * @param owner_id the owner_id to set
     */
    public void setOwner_id(long owner_id) {
        this.owner_id = owner_id;
    }

    /**
     * @return the Vehicle
     */
    @ManyToMany(cascade = CascadeType.ALL)

    public Set<Vehicle> getVehicle() {
        return Vehicle;
    }

    /**
     * @param Vehicle the Vehicle to set
     */
    public void setVehicle(Set<Vehicle> Vehicle) {
        this.Vehicle = Vehicle;
    }
}
