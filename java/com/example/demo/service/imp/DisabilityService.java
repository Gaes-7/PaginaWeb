package com.example.demo.service.imp;


import com.example.demo.Entity.Disability;

import java.util.List;

public interface DisabilityService {

    public List<Disability> findAll();

    public void create (Disability disability);
    public void  update (Disability disability);
    public void delete (Disability disability);
}
