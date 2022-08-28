package com.nseit.tableCreation.service;

import com.nseit.tableCreation.model.Vehicle;
import com.nseit.tableCreation.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;
    public void add(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }
}
