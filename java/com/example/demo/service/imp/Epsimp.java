package com.example.demo.service.imp;

import com.example.demo.Entity.Eps;
import com.example.demo.Entity.User;
import com.example.demo.repository.EpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Epsimp implements EpsService{

    @Autowired
    private EpsRepository epsRepository;
    private Epsimp EpsRepository;

    @Override
    public List<Eps> findAll() {
        return null;
    }

    @Override
    public void create(Eps eps) {
        this.epsRepository.save(eps);
    }

    @Override
    public void update(Eps eps) {
        this.epsRepository.save(eps);
    }

    @Override
    public void delete(Eps eps) {
        this.epsRepository.delete(eps);
    }
    public  List<Eps> findById(int idEps){return  this.EpsRepository.findById(idEps);
    }
}
