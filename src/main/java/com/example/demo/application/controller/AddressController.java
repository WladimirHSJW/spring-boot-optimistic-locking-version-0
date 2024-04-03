package com.example.demo.application.controller;

import com.example.demo.application.mapper.AddressMapper;
import com.example.demo.application.model.AddressDto;
import com.example.demo.domain.model.AddressDom;
import com.example.demo.domain.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AddressController {

    private final AddressMapper addressMapper;
    private final AddressService addressService;

    public AddressDto saveAddress(AddressDto addressDto) {
        AddressDom addressDom = addressMapper.dto2Dom(addressDto);
        addressDom = addressService.saveAddress(addressDom);

        return addressMapper.dom2Dto(addressDom);
    }


    public AddressDto getAddressById(Long id) {
        AddressDom addressDom = addressService.getAddressById(id);

        return addressMapper.dom2Dto(addressDom);
    }

}
