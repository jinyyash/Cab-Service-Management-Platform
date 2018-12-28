/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.service;

import com.ucsc.cabservice.model.Ride;
import java.util.List;

/**
 *
 * @author Jinadi
 */
public interface RideService {

    public Ride addRide(Ride customer);

    public Ride updateRide(Ride customer);

    public String deleteRide(Ride customer);

    public List<Ride> getAllRides();

    public Ride getRide(Long id);
}
