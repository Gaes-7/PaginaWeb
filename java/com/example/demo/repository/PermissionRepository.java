package com.example.demo.repository;


import com.example.demo.Entity.Permission;
import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionRepository extends JpaRepository<Permission,Integer> {

    @Query(value = "Select * from permisos where idPermisos=idPermisos",nativeQuery=true)
    public List<Permission> findById(int idPermisos);
}
