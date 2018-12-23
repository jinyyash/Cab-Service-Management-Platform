/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jinadi
 */
@Entity
@Table(name="package")
public class Package implements Serializable {

    private long package_id;
    private String package_name;
    /*@Access(AccessType.FIELD)
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "package_id")*/
    private List<Vehicle> vehiclelist;

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
     * @return the vehiclelist
     */
    @OneToMany(cascade = CascadeType.ALL)
    public List<Vehicle> getVehiclelist() {
        return vehiclelist;
    }

    /**
     * @param vehiclelist the vehiclelist to set
     */
    public void setVehiclelist(List<Vehicle> vehiclelist) {
        this.vehiclelist = vehiclelist;
    }
}
