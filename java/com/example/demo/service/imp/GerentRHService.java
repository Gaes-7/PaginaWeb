package com.example.demo.service.imp;

import com.example.demo.Entity.GerentRH;

import java.util.List;

public interface GerentRHService {

    public List<GerentRH> findAll();

    public void create (GerentRH gerentRH);
    public void  update (GerentRH gerentRH);
    public void delete (GerentRH gerentRH);
}
