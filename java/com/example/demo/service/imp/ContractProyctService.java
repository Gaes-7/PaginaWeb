package com.example.demo.service.imp;


import com.example.demo.Entity.ContractProyct;

import java.util.List;

public interface ContractProyctService {

    public List<ContractProyct> findAll();

    public void create (ContractProyct contractProyct);
    public void  update (ContractProyct contractProyct);
    public void delete (ContractProyct contractProyct);
}
