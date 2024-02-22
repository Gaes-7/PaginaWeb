package com.example.demo.service.imp;


import com.example.demo.Entity.Permission;

import java.util.List;

public interface PermissionService {

    public List<Permission> findAll();

    public void create (Permission permission);
    public void  update (Permission permission);
    public void delete (Permission permission);
}
