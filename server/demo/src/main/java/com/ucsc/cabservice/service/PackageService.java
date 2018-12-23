/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.service;

import com.ucsc.cabservice.model.Package;
import java.util.List;

/**
 *
 * @author Jinadi
 */
public interface PackageService {

    public Package addPackage(Package customer);

    public Package updatePackage(Package customer);

    public String deletePackage(Package customer);

    public List<Package> getAllPackages();

    public Package getPackage(Long id);
}
