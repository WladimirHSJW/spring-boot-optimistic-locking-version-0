package com.example.demo.persistence.service;

import com.example.demo.domain.model.AddressDom;
import com.example.demo.persistence.mapper.AddressEntityMapper;
import com.example.demo.persistence.model.AddressEntity;
import com.example.demo.persistence.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressPersistenceService {

    private final AddressEntityMapper addressEntityMapper;
    private final AddressRepository addressRepository;

    public AddressDom saveAddress(AddressDom addressDom) {
        AddressEntity addressEntity = addressEntityMapper.dom2Entity(addressDom);
        addressEntity = addressRepository.save(addressEntity);

        return addressEntityMapper.entity2Dom(addressEntity);
    }

    public AddressDom getAddressById(Long id) {
        return addressRepository.findById(id).map(addressEntityMapper::entity2Dom).orElseThrow();
    }
}
