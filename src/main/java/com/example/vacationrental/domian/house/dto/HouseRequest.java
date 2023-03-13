package com.example.vacationrental.domian.house.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HouseRequest {
    private String description;
    private double price;
    private int room;
    private int bathroom;
    private int garage;
    private int accommodate;
    private boolean active;
}
