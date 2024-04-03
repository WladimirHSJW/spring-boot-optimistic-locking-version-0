package com.example.demo.application.mapper;

import com.example.demo.application.model.UserDto;
import com.example.demo.domain.model.UserDom;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {

    @Mapping(target = "address.id", source = "addressId")
    @Mapping(target = "address.version", constant = "0")
    UserDom dto2Dom(UserDto userDto);

    @Mapping(target = "addressId", source = "address.id")
    UserDto dom2Dto(UserDom userDom);
}
