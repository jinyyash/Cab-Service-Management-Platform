/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Jinadi
 */
@Entity
@Table(name="payment")

public class Payment implements Serializable  {

    private long payment_id;
    private Ride ride;

    /**
     * @return the payment_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getPayment_id() {
        return payment_id;
    }

    /**
     * @param payment_id the payment_id to set
     */
    public void setPayment_id(long payment_id) {
        this.payment_id = payment_id;
    }

    /**
     * @return the ride
     */
    @OneToOne(cascade = CascadeType.ALL)
    public Ride getRide() {
        return ride;
    }

    /**
     * @param ride the ride to set
     */
    public void setRide(Ride ride) {
        this.ride = ride;
    }

}
