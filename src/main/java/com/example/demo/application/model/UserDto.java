package com.example.demo.application.model;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String firstname;
    private String lastname;
    private Integer version;
    private Long addressId;
}
