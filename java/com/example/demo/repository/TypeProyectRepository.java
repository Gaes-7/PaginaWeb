package com.example.demo.repository;

import com.example.demo.Entity.TypeProyect;
import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeProyectRepository extends JpaRepository<TypeProyect,Integer> {

    @Query(value = "Select * from tipoproyecto where idTipoProyecto=idTipoProyecto",nativeQuery=true)
    public List<TypeProyect> findById(int idTipoProyecto);}
