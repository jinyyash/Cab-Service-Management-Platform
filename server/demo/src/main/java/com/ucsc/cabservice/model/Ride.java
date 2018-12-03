/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.model;

import java.util.HashSet;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.mapping.Set;

/**
 *
 * @author Jinadi
 */
@Entity
public class Ride {

    private long ride_id;
    private Payment payment;
    private java.util.Set<Vehicle> vehiv = new HashSet<Vehicle>();

    public Ride() {
    }

    /**
     * @return the ride_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getRide_id() {
        return ride_id;
    }

    /**
     * @param ride_id the ride_id to set
     */
    public void setRide_id(long ride_id) {
        this.ride_id = ride_id;
    }

    /**
     * @return the payment
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    /**
     * @return the vehiv
     */
    @OneToMany(cascade = CascadeType.ALL)
    public java.util.Set<Vehicle> getVehiv() {
        return vehiv;
    }

    /**
     * @param vehiv the vehiv to set
     */
    public void setVehiv(java.util.Set<Vehicle> vehiv) {
        this.vehiv = vehiv;
    }

}
