package com.example.demo.persistence.mapper;

import com.example.demo.domain.model.AddressDom;
import com.example.demo.persistence.model.AddressEntity;
import org.mapstruct.Mapper;

@Mapper
public interface AddressEntityMapper {

    AddressEntity dom2Entity(AddressDom addressDom);

    AddressDom entity2Dom(AddressEntity addressEntity);
}
