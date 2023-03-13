package com.example.vacationrental.api.controller;

import com.example.vacationrental.api.assembler.HouseAssembler;
import com.example.vacationrental.application.service.house.HouseService;
import com.example.vacationrental.domian.house.dto.HouseRequest;
import com.example.vacationrental.domian.house.dto.HouseResponse;
import com.example.vacationrental.domian.house.entity.House;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/houses")
@AllArgsConstructor
public class HouseController {

    private HouseService houseService;
    private HouseAssembler houseAssembler;

    @GetMapping
    public List<HouseResponse> findAll(){
        return houseAssembler.toCollectionDto(houseService.findAll());
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public House save(@Valid @RequestBody HouseRequest houseRequest){
        return houseService.save(houseAssembler.dtoToEntity(houseRequest));
    }
}
