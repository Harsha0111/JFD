package com.nseit.tableCreation.service;

import com.nseit.tableCreation.model.Owner;
import com.nseit.tableCreation.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {
    @Autowired
    private OwnerRepository ownerRepository;

    public void add(Owner owner){
        ownerRepository.save(owner);
    }
}
