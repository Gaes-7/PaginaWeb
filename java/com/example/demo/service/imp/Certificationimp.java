package com.example.demo.service.imp;

import com.example.demo.Entity.Certification;
import com.example.demo.Entity.ContractEmp;
import com.example.demo.repository.CertificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Certificationimp implements CertificationService{

    @Autowired
    private CertificationRepository certificationRepository;
    private Certificationimp CertificationRepository;

    @Override
    public List<Certification> findAll() {
        return null;
    }

    @Override
    public void create(Certification certification) {
        this.certificationRepository.save(certification);
    }

    @Override
    public void update(Certification certification) {
        this.certificationRepository.save(certification);
    }

    @Override
    public void delete(Certification certification) {
        this.certificationRepository.delete(certification);
    }
    public  List<Certification> findById(int idCertificado){return  this.CertificationRepository.findById(idCertificado);
    }
}
