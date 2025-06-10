package com.Supermarket.model;

import jakarta.persistence.*;
import lombok.Data;


import java.util.UUID;


@Data
@Entity
@Table(name = "TABLE_USER")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String role;
    private String turn;


    }


