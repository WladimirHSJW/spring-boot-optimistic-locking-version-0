package com.example.demo.domain.model;

import lombok.Data;

@Data
public class UserDom {
    private Long id;
    private String firstname;
    private String lastname;
    private Integer version;
    private AddressDom address;
}
