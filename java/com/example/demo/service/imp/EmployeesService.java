package com.example.demo.service.imp;


import com.example.demo.Entity.Employees;

import java.util.List;

public interface EmployeesService {

    public List<Employees> findAll();

    public void create (Employees employees);
    public void  update (Employees employees);
    public void delete (Employees employees);

}
