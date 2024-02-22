package com.example.demo.service.imp;


import com.example.demo.Entity.City;

import java.util.List;

public interface CityService {

    public List<City> findAll();

    public void create (City city);
    public void  update (City city);
    public void delete (City city);
}
