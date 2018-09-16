/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.model;

import java.util.HashSet;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.mapping.Set;

/**
 *
 * @author Pasan Mudalige
 */
@Entity
public class Customer {

     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long custId;
    private String custName;
    private int custPhone;
    private String custEmail;
    private String custPassword;
   
    

    public Customer() {
    }

    public Customer(Long custId, String custName, int custPhone, String custEmail, String custPassword) {
        this.custId = custId;
        this.custName = custName;
        this.custPhone = custPhone;
        this.custEmail = custEmail;
        this.custPassword = custPassword;
    }

   
    

    

   

    /**
     * @return the custId
     */
   
    public Long getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(Long custId) {
        this.custId = custId;
    }

    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }


    /**
     * @return the custPhone
     */
    public int getCustPhone() {
        return custPhone;
    }

    /**
     * @param custPhone the custPhone to set
     */
    public void setCustPhone(int custPhone) {
        this.custPhone = custPhone;
    }

    /**
     * @return the custEmail
     */
    public String getCustEmail() {
        return custEmail;
    }

    /**
     * @param custEmail the custEmail to set
     */
    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    /**
     * @return the custPassword
     */
    public String getCustPassword() {
        return custPassword;
    }

    /**
     * @param custPassword the custPassword to set
     */
    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }

   

}
