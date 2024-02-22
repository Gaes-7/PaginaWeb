package com.example.demo.service.imp;

import com.example.demo.Entity.Disability;
import com.example.demo.Entity.User;
import com.example.demo.repository.DisabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Disabilityimp implements DisabilityService{

    @Autowired
    private DisabilityRepository disabilityRepository;
    private Disabilityimp DisabilityRepository;

    @Override
    public List<Disability> findAll() {
        return null;
    }

    @Override
    public void create(Disability disability) {
        this.disabilityRepository.save(disability);
    }

    @Override
    public void update(Disability disability) {
        this.disabilityRepository.save(disability);
    }

    @Override
    public void delete(Disability disability) {
        this.disabilityRepository.delete(disability);
    }
    public  List<Disability> findById(int idIncapacidades){return  this.DisabilityRepository.findById(idIncapacidades);
    }
}
