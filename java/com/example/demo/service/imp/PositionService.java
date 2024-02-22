package com.example.demo.service.imp;


import com.example.demo.Entity.Position;

import java.util.List;

public interface PositionService {

    public List<Position> findAll();

    public void create (Position position);
    public void  update (Position position);
    public void delete (Position position);
}
