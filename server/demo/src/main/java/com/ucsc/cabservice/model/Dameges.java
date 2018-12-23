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
import javax.persistence.Table;

/**
 *
 * @author Jinadi
 */
@Entity
@Table(name = "dameges")
public class Dameges  implements Serializable {

    private long damage_id;
    private String descrption;
    private int cost;
   /* @Access(AccessType.FIELD)
    @ManyToMany(targetEntity = Vehicle.class, cascade = {CascadeType.ALL},fetch=FetchType.EAGER)
    @JoinTable(name = "vehicle",
            joinColumns = {
                @JoinColumn(name = "damage_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "vehicle_id")})*/
    private List<Vehicle> vehiclelist=new ArrayList<Vehicle>();

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
     * @return the descrption
     */
    public String getDescrption() {
        return descrption;
    }

    /**
     * @param descrption the descrption to set
     */
    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * @return the vehiclelist
     */
    @ManyToMany(targetEntity = Vehicle.class, cascade = {CascadeType.ALL},fetch=FetchType.EAGER)
    public List<Vehicle> getVehiclelist() {
        return vehiclelist;
    }

    /**
     * @param vehiclelist the vehiclelist to set
     */
    public void setVehiclelist(List<Vehicle> vehiclelist) {
        this.vehiclelist = vehiclelist;
    }

    /**
     * @return the Vehicle
     */
    
}
