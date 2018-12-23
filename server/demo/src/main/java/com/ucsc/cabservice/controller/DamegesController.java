/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.controller;

import com.ucsc.cabservice.model.Vehicle;
import java.io.Serializable;
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
public class DamegesController implements Serializable  {

    private long damage_id;
    private Set<Vehicle> Vehicle = new HashSet<Vehicle>();

    /**
     * @return the damage_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getDamage_id() {
        return damage_id;
    }

    /**
     * @param damage_id the damage_id to set
     */
    public void setDamage_id(long damage_id) {
        this.damage_id = damage_id;
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
