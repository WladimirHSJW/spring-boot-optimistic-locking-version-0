package com.example.demo.application.model;

import lombok.Data;

@Data
public class AddressDto {
    private Long id;
    private String street;
    private String streetNr;
    private Integer version;
}
