package com.example.vacationrental.domian.house.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class HouseResponse {
    private UUID id;
    private String description;
    private double price;
    private int room;
    private int bathroom;
    private int garage;
    private int accommodate;
    private boolean active;
}
