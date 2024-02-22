package com.example.demo.service.imp;

import com.example.demo.Entity.City;
import com.example.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Cityimp implements CityService{

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return null;
    }

    @Override
    public void create(City city) {
        this.cityRepository.save(city);
    }

    @Override
    public void update(City city) {
        this.cityRepository.save(city);
    }

    @Override
    public void delete(City city) {
        this.cityRepository.delete(city);
    }

    public  List<City> findByName(int idCiudad){
        return  this.cityRepository.findById(idCiudad);
    }
}
