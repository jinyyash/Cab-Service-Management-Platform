/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.repository;

import com.ucsc.cabservice.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jinadi
 */
  @Repository
public interface DriverRepository extends JpaRepository<Driver, Long>{
  
}
