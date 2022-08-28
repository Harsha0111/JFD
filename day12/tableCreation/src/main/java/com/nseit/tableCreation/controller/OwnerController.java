package com.nseit.tableCreation.controller;

import com.nseit.tableCreation.model.Owner;
import com.nseit.tableCreation.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owner")
public class OwnerController {
    @Autowired
    private OwnerService ownerService;
    @PostMapping
    public void add(@RequestBody Owner owner){
        ownerService.add(owner);
    }

}
