package com.example.demo.application.mapper;

import com.example.demo.application.model.AddressDto;
import com.example.demo.domain.model.AddressDom;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {

    AddressDom dto2Dom(AddressDto addressDto);

    AddressDto dom2Dto(AddressDom addressDom);

}
