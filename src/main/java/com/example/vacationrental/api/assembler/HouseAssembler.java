package com.example.vacationrental.api.assembler;

import com.example.vacationrental.domian.house.dto.HouseRequest;
import com.example.vacationrental.domian.house.dto.HouseResponse;
import com.example.vacationrental.domian.house.entity.House;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class HouseAssembler {
    private ModelMapper modelMapper;

    public House dtoToEntity(HouseRequest houseRequest){
        return modelMapper.map(houseRequest, House.class);
    }
    public HouseResponse entityToDto(House house){
        return modelMapper.map(house, HouseResponse.class);
    }
    public List<HouseResponse> toCollectionDto(List<House> houses){
        return houses.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
