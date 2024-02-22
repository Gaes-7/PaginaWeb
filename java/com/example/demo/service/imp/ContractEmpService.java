package com.example.demo.service.imp;


import com.example.demo.Entity.ContractEmp;

import java.util.List;

public interface ContractEmpService {

    public List<ContractEmp> findAll();

    public void create (ContractEmp contractEmp);
    public void  update (ContractEmp contractEmp);
    public void delete (ContractEmp contractEmp);

}
