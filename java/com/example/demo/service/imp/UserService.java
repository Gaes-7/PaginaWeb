package com.example.demo.service.imp;

import com.example.demo.DTO.UserDTO;
import com.example.demo.Entity.User;

import java.util.List;


public interface UserService {
    public List<User> findAll();
    public User create (UserDTO user);
    public User update (UserDTO user);
    public User delete (Long user);


    User findById(Long id);
}
