/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.mapping.Set;

/**
 *
 * @author Pasan Mudalige
 */
@Entity
@Table(name = "customer")

public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long custId;
    private String custName;
    private String custPhone;
    private String custEmail;
    private String custPassword;
   /* @Access(AccessType.PROPERTY)
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "custId")*/
    private List<Ride> rides;
   /* @Access(AccessType.FIELD)
    @ManyToMany(targetEntity = Package.class, cascade = {CascadeType.ALL},fetch=FetchType.EAGER)
    @JoinTable(name = "package",
            joinColumns = {
                @JoinColumn(name = "custId")},
            inverseJoinColumns = {
                @JoinColumn(name = "package_id")})*/
    private List<Package> packagelist;

    public Customer() {
    }

    public Customer(Long custId, String custName, String custPhone, String custEmail, String custPassword) {
        this.custId = custId;
        this.custName = custName;
        this.custPhone = custPhone;
        this.custEmail = custEmail;
        this.custPassword = custPassword;
    }

    /**
     * @return the custId
     */
    @Id
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
    public String getCustPhone() {
        return custPhone;
    }

    /**
     * @param custPhone the custPhone to set
     */
    public void setCustPhone(String custPhone) {
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

    /**
     * @return the rides
     */
     @OneToMany(cascade = CascadeType.ALL)
    public List<Ride> getRides() {
        return rides;
    }

    /**
     * @param rides the rides to set
     */
    public void setRides(List<Ride> rides) {
        this.rides = rides;
    }

    /**
     * @return the packagelist
     */
     @ManyToMany( cascade = {CascadeType.ALL},fetch=FetchType.EAGER)
    public List<Package> getPackagelist() {
        return packagelist;
    }

    /**
     * @param packagelist the packagelist to set
     */
    public void setPackagelist(List<Package> packagelist) {
        this.packagelist = packagelist;
    }

}
