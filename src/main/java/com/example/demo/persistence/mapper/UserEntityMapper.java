package com.example.demo.persistence.mapper;

import com.example.demo.domain.model.UserDom;
import com.example.demo.persistence.model.UserEntity;
import org.mapstruct.Mapper;

@Mapper(uses = AddressEntityMapper.class)
public interface UserEntityMapper {

    UserEntity dom2Entity(UserDom userDom);

    UserDom entity2Dom(UserEntity userEntity);

}
