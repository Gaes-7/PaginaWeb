package com.example.demo.service.imp;

import com.example.demo.Entity.Admin;


import java.util.List;

public interface AdminService {

    public List<Admin> findAll();
    public void create (Admin admin);
    public void  update (Admin admin);
    public void delete (Admin admin);
}
