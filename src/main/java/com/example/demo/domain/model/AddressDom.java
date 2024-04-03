package com.example.demo.domain.model;


import lombok.Data;

@Data
public class AddressDom {
    private Long id;
    private String street;
    private String streetNr;
    private Integer version;
}
