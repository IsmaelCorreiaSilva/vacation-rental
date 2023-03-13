package com.example.vacationrental.domian.house.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "tb_house")
@Getter
@Setter
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String description;
    private double price;
    private int room;
    private int bathroom;
    private int garage;
    private int accommodate;
    private boolean active;
}
