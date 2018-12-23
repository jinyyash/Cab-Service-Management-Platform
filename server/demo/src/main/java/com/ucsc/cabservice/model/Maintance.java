/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jinadi
 */
@Entity
@Table(name="maintaince")

public class Maintance implements Serializable  {
    private long maintain_id;

    /**
     * @return the maintain_id
     */
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getMaintain_id() {
        return maintain_id;
    }

    /**
     * @param maintain_id the maintain_id to set
     */
    public void setMaintain_id(long maintain_id) {
        this.maintain_id = maintain_id;
    }
}
