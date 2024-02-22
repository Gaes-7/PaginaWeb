package com.example.demo.service.imp;


import com.example.demo.Entity.Eps;

import java.util.List;

public interface EpsService {

    public List<Eps> findAll();

    public void create (Eps eps);
    public void  update (Eps eps);
    public void delete (Eps eps);

}
