package com.example.demo.repository;


import com.example.demo.Entity.Position;
import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PositionRepository extends JpaRepository<Position,Integer> {

    @Query(value = "Select * from cargo where idCargo=idCargo", nativeQuery = true)
    public List<Position> findById(int idCargo);


}
