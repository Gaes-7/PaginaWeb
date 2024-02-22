package com.example.demo.repository;



import com.example.demo.Entity.Eps;
import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpsRepository extends JpaRepository<Eps,Integer> {

    @Query(value = "Select * from eps where idEps=idEps",nativeQuery=true)
    public List<Eps> findById(int idEps);
}
