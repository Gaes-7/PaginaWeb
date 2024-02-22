package com.example.demo.repository;

import com.example.demo.Entity.ContractEmp;
import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractEmpRepository extends JpaRepository<ContractEmp,Integer> {

    @Query(value = "Select * from contratoemp where idContratoEmp=idContratoEmp",nativeQuery=true)
    public List<ContractEmp> findById(int idContratoEmp);
}
