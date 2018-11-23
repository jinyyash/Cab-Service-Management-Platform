/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.repository;

import com.ucsc.cabservice.model.Driver;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jinadi
 */
@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

    @Query("select d from Driver d where d.id=:id")
    public List<Driver> getDriverById(@Param("id") long id);

    @Query("select d from Driver d where d.name=:name")
    public List<Driver> getDriverByName(@Param("name") String nic);

    @Query("select d from Driver d where d.nic=:nic")
    public List<Driver> getDriverByNIC(@Param("nic") String nic);

}
