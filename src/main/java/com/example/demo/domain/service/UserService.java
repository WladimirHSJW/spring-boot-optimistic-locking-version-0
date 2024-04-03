package com.example.demo.domain.service;

import com.example.demo.domain.model.UserDom;
import com.example.demo.persistence.service.UserPersistenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserPersistenceService userPersistenceService;

    public UserDom saveUser(UserDom userDom) {
        return userPersistenceService.saveUser(userDom);
    }
}
