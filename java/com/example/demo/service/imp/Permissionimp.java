package com.example.demo.service.imp;

import com.example.demo.Entity.Permission;
import com.example.demo.Entity.User;
import com.example.demo.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Permissionimp implements PermissionService{

    @Autowired
    private PermissionRepository permissionRepository;
    private Permissionimp PermissionRepository;

    @Override
    public List<Permission> findAll() {
        return null;
    }

    @Override
    public void create(Permission permission) {
        this.permissionRepository.save(permission);
    }

    @Override
    public void update(Permission permission) {
        this.permissionRepository.save(permission);
    }

    @Override
    public void delete(Permission permission) {
        this.permissionRepository.delete(permission);
    }
    public  List<Permission> findById(int idPermisos){return  this.PermissionRepository.findById(idPermisos);
    }
}
