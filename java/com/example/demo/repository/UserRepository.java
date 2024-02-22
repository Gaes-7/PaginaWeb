package com.example.demo.repository;

import com.example.demo.DTO.UserDTO;
import com.example.demo.Entity.Disability;
import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value = "Select * from usuarios where idUsuarios=idUsuarios",nativeQuery=true)
    public List<User> findById(int idUsuarios);

    void create(UserDTO idUsuario);
    void update(UserDTO idUsuario);
    void delete(Long idUsuario);

}
