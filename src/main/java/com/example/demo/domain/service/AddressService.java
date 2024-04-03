package com.example.demo.domain.service;

import com.example.demo.domain.model.AddressDom;
import com.example.demo.persistence.service.AddressPersistenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressPersistenceService addressPersistenceService;

    public AddressDom saveAddress(AddressDom addressDom) {
        return addressPersistenceService.saveAddress(addressDom);
    }

    public AddressDom getAddressById(Long id) {
        return addressPersistenceService.getAddressById(id);
    }
}
