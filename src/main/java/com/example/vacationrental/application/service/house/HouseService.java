package com.example.vacationrental.application.service.house;

import com.example.vacationrental.domian.house.entity.House;
import com.example.vacationrental.domian.house.repository.HouseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class HouseService {

    private HouseRepository houseRepository;

    public House save(House house){
        return houseRepository.save(house);
    }
    public Optional<House> findById(UUID id){
        return houseRepository.findById(id);
    }
    public List<House> findAll(){
        return houseRepository.findAll();
    }
}
