/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.repository;

import com.ucsc.cabservice.model.Customer;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pasan Mudalige
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
    @Query("SELECT c from Customer c where c.custPhone = :mobile")
    List<Customer> findCustomerByMobile(@Param("mobile")String mobile);
}
