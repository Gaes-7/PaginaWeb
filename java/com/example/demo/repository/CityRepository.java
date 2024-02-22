package com.example.demo.repository;

import com.example.demo.Entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {


    @Query(value = "SELECT * FROM ciudad where NomCiudad=:name",nativeQuery = true)
    public List<City> findById(int idCiudad);
}
