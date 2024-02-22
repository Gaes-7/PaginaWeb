package com.example.demo.service.imp;

import com.example.demo.Entity.TypeProyect;
import com.example.demo.Entity.User;
import com.example.demo.repository.TypeProyectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeProyectimp implements TypeProyectService{

    @Autowired
    private TypeProyectRepository typeProyectRepository;

    @Override
    public List<TypeProyect> findAll() {
        return null;
    }

    @Override
    public void create(TypeProyect typeProyect) {
        this.typeProyectRepository.save(typeProyect);
    }

    @Override
    public void update(TypeProyect typeProyect) {
        this.typeProyectRepository.save(typeProyect);
    }

    @Override
    public void delete(TypeProyect typeProyect) {
        this.typeProyectRepository.delete(typeProyect);
    }
    public  List<TypeProyect> findById(int idTipoProyecto){return  this.typeProyectRepository.findById(idTipoProyecto);
    }
}
