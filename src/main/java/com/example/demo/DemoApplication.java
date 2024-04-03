package com.example.demo;

import com.example.demo.application.controller.AddressController;
import com.example.demo.application.controller.UserController;
import com.example.demo.application.model.AddressDto;
import com.example.demo.application.model.UserDto;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class DemoApplication {

    private final UserController userController;
    private final AddressController addressController;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @PostConstruct
    @Transactional
    public void init() {
        UserDto userDto = new UserDto();
        userDto.setFirstname("Max");
        userDto.setLastname("Mustermann");

        log.info("----------------------------------------------------------------------------------------------");
        log.info("----------------------------------------------------------------------------------------------");
        log.info("----------------------------------------------------------------------------------------------");
        UserDto user = userController.saveUser(userDto);
        log.info("created user: {}", user);

        AddressDto createdUserAddress = addressController.getAddressById(user.getAddressId());
        log.info("user: {} address: {}", user, createdUserAddress);

        user.setLastname("New Lastname");
        UserDto updatedUser = userController.saveUser(user);
        log.info("updated user: {}", updatedUser);

        AddressDto updatedUserAddress = addressController.getAddressById(updatedUser.getAddressId());
        log.info("user: {} address: {}", updatedUser, updatedUserAddress);
        log.info("----------------------------------------------------------------------------------------------");
        log.info("----------------------------------------------------------------------------------------------");
        log.info("----------------------------------------------------------------------------------------------");
    }

}
