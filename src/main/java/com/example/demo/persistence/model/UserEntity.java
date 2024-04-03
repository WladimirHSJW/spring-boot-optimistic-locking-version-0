package com.example.demo.persistence.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstname;
    private String lastname;
    @Version
    private Integer version;
    @OneToOne(cascade = CascadeType.ALL)
    private AddressEntity address;
}
