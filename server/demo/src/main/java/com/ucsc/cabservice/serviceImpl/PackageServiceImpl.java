/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.serviceImpl;

import com.ucsc.cabservice.model.Package;
import com.ucsc.cabservice.repository.PackageRepository;
import com.ucsc.cabservice.service.PackageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jinadi
 */
@Service
public class PackageServiceImpl implements PackageService{
    @Autowired
    private PackageRepository packageRepository;

    @Override
    public Package addPackage(Package p) {
        return packageRepository.save(p);
    }

    @Override
    public Package updatePackage(Package p) {
        return packageRepository.save(p);
    }

    @Override
    public List<Package> getAllPackages() {
        return packageRepository.findAll();
    }

    @Override
    public Package getPackage(Long id) {
        return packageRepository.findOne(id);
    }

    @Override
    public String deletePackage(Package p) {
        packageRepository.delete(p);
        return "true";
    }
    
}
