package com.example.demo.service.imp;

import com.example.demo.Entity.Costumer;
import com.example.demo.Entity.User;
import com.example.demo.repository.CostumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Costumerimp implements CostumerService{

    @Autowired
    private CostumerRepository costumerRepository;
    private Costumerimp CostumerRepository;

    @Override
    public List<Costumer> findAll() {
        return null;
    }

    @Override
    public void create(Costumer costumer) {
        this.costumerRepository.save(costumer);
    }

    @Override
    public void update(Costumer costumer) {
        this.costumerRepository.save(costumer);
    }

    @Override
    public void delete(Costumer costumer) {
        this.costumerRepository.delete(costumer);
    }
    public  List<Costumer> findById(int idCliente){
        return  this.CostumerRepository.findById(idCliente);
    }
}
