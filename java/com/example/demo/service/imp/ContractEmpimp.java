package com.example.demo.service.imp;

import com.example.demo.Entity.ContractEmp;
import com.example.demo.Entity.User;
import com.example.demo.repository.ContractEmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractEmpimp implements ContractEmpService{

    @Autowired
    private ContractEmpRepository contractEmpRepository;
    private ContractEmpimp ContractEmRepository;

    @Override
    public List<ContractEmp> findAll() {
        return null;
    }

    @Override
    public void create(ContractEmp contractEmp) {
        this.contractEmpRepository.save(contractEmp);
    }

    @Override
    public void update(ContractEmp contractEmp) {
        this.contractEmpRepository.save(contractEmp);
    }

    @Override
    public void delete(ContractEmp contractEmp) {
        this.contractEmpRepository.delete(contractEmp);
    }
    public  List<ContractEmp> findById(int idContratoEmp){
        return  this.ContractEmRepository.findById(idContratoEmp);
    }
}
