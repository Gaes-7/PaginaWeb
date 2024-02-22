package com.example.demo.service.imp;

import com.example.demo.Entity.Certification;


import java.util.List;

public interface CertificationService {

    public List<Certification> findAll();

    public void create (Certification certification);
    public void  update (Certification certification);
    public void delete (Certification certification);
}
