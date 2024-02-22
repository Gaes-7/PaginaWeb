package com.example.demo.repository;


import com.example.demo.Entity.ContractProyct;
import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractProyctRepository extends JpaRepository<ContractProyct,Integer> {

    @Query(value = "Select * from contratoproyecto where idContratoProyecto=idContratoProyecto",nativeQuery=true)
    public List<ContractProyct> findById(int idContratoProyecto);
}
