package com.example.demo.service.imp;


import com.example.demo.Entity.Costumer;

import java.util.List;

public interface CostumerService {
    public List<Costumer> findAll();

    public void create (Costumer costumer);
    public void  update (Costumer costumer);
    public void delete (Costumer costumer);

}
