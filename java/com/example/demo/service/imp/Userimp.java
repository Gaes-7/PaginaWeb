package com.example.demo.service.imp;

import com.example.demo.DTO.UserDTO;
import com.example.demo.Entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class Userimp implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User create(UserDTO idUsuario) {
        this.userRepository.create(idUsuario);
        return null;
    }

    @Override
    public User update(UserDTO idUsuario) {
        this.userRepository.update(idUsuario);
        return null;
    }

    @Override
    public User delete(Long idUsuario) {
        this.userRepository.delete(idUsuario);
        return null;
    }
    public  List<User> findById(int idUsuarios){
        return  this.userRepository.findById(idUsuarios);
    }
}
