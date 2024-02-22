package com.example.demo.service.imp;


import com.example.demo.Entity.TypeProyect;

import java.util.List;

public interface TypeProyectService {

    public List<TypeProyect> findAll();

    public void create (TypeProyect typeProyect);
    public void  update (TypeProyect typeProyect);
    public void delete (TypeProyect typeProyect);
}
