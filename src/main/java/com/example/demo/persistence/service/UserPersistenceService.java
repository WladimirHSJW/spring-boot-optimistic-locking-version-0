package com.example.demo.persistence.service;

import com.example.demo.domain.model.UserDom;
import com.example.demo.persistence.mapper.UserEntityMapper;
import com.example.demo.persistence.model.UserEntity;
import com.example.demo.persistence.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserPersistenceService {

    private final UserEntityMapper userEntityMapper;
    private final UserRepository userRepository;

    public UserDom saveUser(UserDom userDom) {
        UserEntity userEntity = userEntityMapper.dom2Entity(userDom);
        userEntity = userRepository.save(userEntity);

        return userEntityMapper.entity2Dom(userEntity);
    }
}
