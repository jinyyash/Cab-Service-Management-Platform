/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.repository;

import com.ucsc.cabservice.model.Driver;
import com.ucsc.cabservice.model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jinadi
 */
  @Repository
public interface RideRepository extends JpaRepository<Ride, Long>{
  
}
