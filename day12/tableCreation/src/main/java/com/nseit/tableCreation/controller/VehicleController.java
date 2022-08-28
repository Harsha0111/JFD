package com.nseit.tableCreation.controller;

import com.nseit.tableCreation.model.Vehicle;
import com.nseit.tableCreation.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public void add(@RequestBody Vehicle vehicle){

        vehicleService.add(vehicle);
    }

}
